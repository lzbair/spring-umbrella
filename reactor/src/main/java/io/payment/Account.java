package io.payment;

import java.util.Date;

public class Account {

    private final String id;
    private final String cardHolder;
    private final String cardType;
    private final String cardNumber;
    private final Date expiryDate;
    private final String cvv;


    public Account(String id, String cardHolder, String cardType, String cardNumber, Date expiryDate, String cvv) {
        this.id = id;
        this.cardHolder = cardHolder;
        this.cardType = cardType;
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.cvv = cvv;
    }

    public String getCardHolder() {
        return cardHolder;
    }

    public String getCardType() {
        return cardType;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public String getCvv() {
        return cvv;
    }

    public String getId() {
        return id;
    }
}
