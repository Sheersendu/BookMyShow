package com.LLD.BookMyShow.models;

import com.LLD.BookMyShow.enums.Language;
import com.LLD.BookMyShow.enums.MovieFeature;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Entity
public class Show extends BaseModel{

    @ManyToOne
    private Movie movie;

    @Enumerated
    private Language language;

    private Date startTime;

    private Date endTime;

    @ManyToOne
    private Hall hall;

    @ElementCollection
    private List<MovieFeature> movieFeatures = new ArrayList<>();

    @OneToMany
    private List<ShowSeat> showSeats = new ArrayList<>();

}
