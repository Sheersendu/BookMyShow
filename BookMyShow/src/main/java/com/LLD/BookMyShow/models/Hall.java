package com.LLD.BookMyShow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Entity
public class Hall extends BaseModel{
    private Integer hallNumber;

    @OneToMany
    private List<Seat> seats = new ArrayList<>();

}
