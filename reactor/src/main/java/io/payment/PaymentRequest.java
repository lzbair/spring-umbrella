package io.payment;

import java.math.BigDecimal;

public class PaymentRequest {

    private final Account source;
    private final Account target;
    private final BigDecimal amount;

    public PaymentRequest(Account source, Account target, BigDecimal amount) {
        this.source = source;
        this.target = target;
        this.amount = amount;
    }

    public Account getSource() {
        return source;
    }

    public Account getTarget() {
        return target;
    }

    public BigDecimal getAmount() {
        return amount;
    }
}
