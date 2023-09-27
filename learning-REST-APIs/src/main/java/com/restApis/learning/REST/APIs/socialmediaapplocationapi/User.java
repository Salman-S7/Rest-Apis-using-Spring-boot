package com.restApis.learning.REST.APIs.socialmediaapplocationapi;

import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class User {
    private int id;
    @Size(min = 2)
    private String name;
    @Past
    private LocalDate localDate;

    public User() {
    }

    public User(int id, String name, LocalDate localDate) {
        this.id = id;
        this.name = name;
        this.localDate = localDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }
}
