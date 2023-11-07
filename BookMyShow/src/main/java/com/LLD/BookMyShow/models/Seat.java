package com.LLD.BookMyShow.models;

import com.LLD.BookMyShow.enums.SeatType;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import lombok.Getter;

import java.util.Date;

@Getter
@Entity
public class Seat extends BaseModel{
    private Integer rowNumber;
    private Integer columnNumber;

    @Enumerated
    private SeatType type;

}
