package com.LLD.BookMyShow.models;

import com.LLD.BookMyShow.enums.TicketStatus;
import jakarta.persistence.*;
import lombok.Getter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Entity
public class Ticket extends BaseModel {
    @ManyToOne
    private Show show;

    @ManyToOne
    private User user;

    @ManyToMany
    private List<ShowSeat> seats = new ArrayList<>();

    private Double amount;

    @Enumerated
    private TicketStatus status;

    @OneToOne
    private Payment payment;

}

// 1 ticket : multiple seats
// 1 seat : multiple ticket (In case of cancellation of ticket one seat can be part of multiple tickets)