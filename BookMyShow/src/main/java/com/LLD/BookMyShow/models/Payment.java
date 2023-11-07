package com.LLD.BookMyShow.models;

import com.LLD.BookMyShow.enums.PaymentMode;
import com.LLD.BookMyShow.enums.PaymentStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import lombok.Getter;

import java.util.Date;

@Getter
@Entity
public class Payment extends BaseModel{
    private String referenceId;

    private Double amount;

    @Enumerated
    private PaymentMode mode;

    @Enumerated
    private PaymentStatus status;

}
