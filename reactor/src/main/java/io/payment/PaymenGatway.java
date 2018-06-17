package io.payment;

import java.math.BigDecimal;

public class PaymenGatway {
    public void transfer(User user, Merchant merchant, BigDecimal amount) {
        Bank.of(user).transfer(Bank.of(merchant), amount);
    }
}
