package com.LLD.BookMyShow.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Entity
//@Table(name = "CITIES") // If we want some other table name apart from city
@NoArgsConstructor
public class City extends BaseModel{
    private String name;

    @OneToMany
//    @Column(name = "theatreList") // If we want to name column explicitly
    private List<Theatre> theatres = new ArrayList<>();

}
