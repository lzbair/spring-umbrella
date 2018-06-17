package io.payment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import reactor.bus.Event;
import reactor.bus.EventBus;

@RestController
public class PaymentController {

    @Autowired
    private EventBus eventBus;

    @RequestMapping(path = "/pay", method = RequestMethod.POST)
    public void pay(@RequestBody PaymentRequest request) {
        eventBus.notify("paymentTransactionProcessor", Event.wrap(request));
    }

}
