package com.LLD.BookMyShow.models;

import com.LLD.BookMyShow.enums.SeatType;

import java.util.Date;

public class Seat extends BaseModel{
    private final Integer rowNumber;
    private final Integer columnNumber;
    private final SeatType type;

    public Seat(Long id, Date createdAt, Date updatedAt, Integer rowNumber, Integer columnNumber, SeatType type) {
        super(id, createdAt, updatedAt);
        this.rowNumber = rowNumber;
        this.columnNumber = columnNumber;
        this.type = type;
    }
}
