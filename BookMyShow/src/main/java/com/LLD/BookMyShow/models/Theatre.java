package com.LLD.BookMyShow.models;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Builder;
import lombok.Getter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Entity
public class Theatre extends BaseModel{
    private String name;
    private String address;

//    @ElementCollection
    @OneToMany
    private List<Hall> halls = new ArrayList<>();

    @OneToMany
    private List<Show> shows = new ArrayList<>();


}
