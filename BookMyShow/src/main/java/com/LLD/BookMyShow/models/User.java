package com.LLD.BookMyShow.models;

import java.util.Date;

public class User extends BaseModel{
    private String email;

    public User(Long id, Date createdAt, Date updatedAt, String email) {
        super(id, createdAt, updatedAt);
        this.email = email;
    }
}
