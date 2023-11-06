package com.LLD.BookMyShow.models;

import com.LLD.BookMyShow.enums.Language;
import com.LLD.BookMyShow.enums.MovieFeature;
import lombok.Builder;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Show extends BaseModel{
    private Movie movie;

    private Language language;

    private Date startTime;

    private Date endTime;

    private Hall hall;

    @Builder.Default
    private List<MovieFeature> movieFeatures = new ArrayList<>();

    @Builder.Default
    private List<ShowSeat> showSeats = new ArrayList<>();

    public Show(Long id, Date createdAt, Date updatedAt, Movie movie, Language language, Date startTime, Date endTime, Hall hall, List<MovieFeature> movieFeatures, List<ShowSeat> showSeats) {
        super(id, createdAt, updatedAt);
        this.movie = movie;
        this.language = language;
        this.startTime = startTime;
        this.endTime = endTime;
        this.hall = hall;
        this.movieFeatures = movieFeatures;
        this.showSeats = showSeats;
    }
}
