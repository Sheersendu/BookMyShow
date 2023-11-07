package com.LLD.BookMyShow.models;

import com.LLD.BookMyShow.enums.SeatStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.Getter;

import java.util.Date;

@Getter
@Entity
public class ShowSeat extends BaseModel{
    private Double price;

    private SeatStatus status;

    @ManyToOne
    private Seat seat;

}
