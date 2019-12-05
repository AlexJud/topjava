package ru.javawebinar.topjava.model;

import lombok.Data;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@ToString
public class MealTo {

    protected final LocalDateTime dateTime;
    protected final String description;
    protected final int calories;
    protected final boolean excess;

    public MealTo(LocalDateTime dateTime, String description, int calories, boolean excess) {
        this.dateTime = dateTime;
        this.description = description;
        this.calories = calories;
        this.excess = excess;
    }
}
