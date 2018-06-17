package io.payment;

public class Merchant {

    private final String accountId;

    public Merchant(String id) {
        this.accountId = id;
    }

    public static Merchant _(Account account){
        return new Merchant(account.getId());
    }
}
