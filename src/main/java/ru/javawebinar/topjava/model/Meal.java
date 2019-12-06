package ru.javawebinar.topjava.model;


import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
public class Meal {
    protected final LocalDateTime dateTime;
    protected final String description;
    protected final int calories;

    public Meal(LocalDateTime dateTime, String description, int calories) {
        this.dateTime = dateTime;
        this.description = description;
        this.calories = calories;
    }

}
