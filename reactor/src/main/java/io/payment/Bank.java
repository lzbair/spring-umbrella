package io.payment;

import java.math.BigDecimal;

public class Bank {
    public static Bank of(Object source) {
        return new Bank();
    }


    public void transfer(Bank target, BigDecimal amount) {
        System.out.println("Payment transfer started");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Payment transfer finished, Amount: " + amount + " paid");
    }
}
