package io.payment;

import reactor.bus.Event;
import reactor.fn.Consumer;


public class PaymentTransactionProcessor implements Consumer<Event<PaymentRequest>> {


    final private PaymenGatway paymenGatway;


    public PaymentTransactionProcessor(PaymenGatway paymenGatway) {
        this.paymenGatway = paymenGatway;
    }

    @Override
    public void accept(Event<PaymentRequest> paymentTransactionEvent) {
        final PaymentRequest data = paymentTransactionEvent.getData();
        PaymentTransaction tx = new PaymentTransaction(paymenGatway);
        tx.from(data.getSource()).to(data.getTarget()).pay(data.getAmount());
    }
}
