package com.LLD.BookMyShow.models;

import com.LLD.BookMyShow.enums.PaymentMode;
import com.LLD.BookMyShow.enums.PaymentStatus;

import java.util.Date;

public class Payment extends BaseModel{
    private final String referenceId;

    private final Double amount;

    private final PaymentMode mode;

    private final PaymentStatus status;

    public Payment(Long id, Date createdAt, Date updatedAt, String referenceId, Double amount, PaymentMode mode, PaymentStatus status) {
        super(id, createdAt, updatedAt);
        this.referenceId = referenceId;
        this.amount = amount;
        this.mode = mode;
        this.status = status;
    }
}
