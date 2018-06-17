package io.payment;

import java.math.BigDecimal;

public class PaymentTransaction {

    private final PaymenGatway paymenGatway;
    Merchant merchant;
    User user;

    public PaymentTransaction(PaymenGatway paymenGatway) {
        this.paymenGatway = paymenGatway;
    }

    public PaymentTransaction from(Account source) {
        this.merchant = Merchant._(source);
        return this;
    }


    public PaymentTransaction to(Account target) {
        this.user = User._(target);
        return this;
    }

    public void pay(BigDecimal amount) {
        paymenGatway.transfer(user, merchant, amount);
    }
}
