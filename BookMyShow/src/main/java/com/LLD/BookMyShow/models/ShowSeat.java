package com.LLD.BookMyShow.models;

import com.LLD.BookMyShow.enums.SeatStatus;

import java.util.Date;

public class ShowSeat extends BaseModel{
    private Double price;

    private SeatStatus status;

    private Seat seat;

    public ShowSeat(Long id, Date createdAt, Date updatedAt, Double price, SeatStatus status, Seat seat) {
        super(id, createdAt, updatedAt);
        this.price = price;
        this.status = status;
        this.seat = seat;
    }
}
