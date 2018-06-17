package io.payment;


import static reactor.bus.selector.Selectors.$;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import reactor.Environment;
import reactor.bus.EventBus;

@SpringBootApplication
public class Application implements CommandLineRunner {

    @Autowired
    private EventBus eventBus;

    @Bean
    EventBus eventBus() {
        return EventBus.create(Environment.initializeIfEmpty().assignErrorJournal(), Environment.THREAD_POOL);
    }

    @Override
    public void run(String... args) throws Exception {
        eventBus.on($("paymentTransactionProcessor"), txProcessor());
    }

    private PaymentTransactionProcessor txProcessor() {
        return new PaymentTransactionProcessor(new PaymenGatway());
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
