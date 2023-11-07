package com.LLD.BookMyShow.models;

import com.LLD.BookMyShow.enums.Language;
import com.LLD.BookMyShow.enums.MovieFeature;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import lombok.Getter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Entity
public class Movie extends BaseModel {
    private String name;
    private Integer duration;
    private Double rating;

    @ElementCollection // used for creating mapping tables for primitive types(strings, int, enums)
    @Enumerated
    private List<Language> languages = new ArrayList<>();

    @ElementCollection
    @Enumerated
    private List<MovieFeature> features = new ArrayList<>();

}
