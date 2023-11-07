package com.LLD.BookMyShow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;

import java.util.Date;

@Getter
@Entity
@Table(name = "USERS")
public class User extends BaseModel{
    private String email;

}
