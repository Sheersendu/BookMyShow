package com.LLD.BookMyShow.models;

import com.LLD.BookMyShow.enums.Language;
import com.LLD.BookMyShow.enums.MovieFeature;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Movie extends BaseModel {
    private String name;
    private Integer duration;
    private Double rating;

    private List<Language> languages = new ArrayList<>();

    private List<MovieFeature> features = new ArrayList<>();

    public Movie(Long id, Date createdAt, Date updatedAt, String name, Integer duration, Double rating, List<Language> languages, List<MovieFeature> features) {
        super(id, createdAt, updatedAt);
        this.name = name;
        this.duration = duration;
        this.rating = rating;
        this.languages = languages;
        this.features = features;
    }
}
