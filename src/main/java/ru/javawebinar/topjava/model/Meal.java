package ru.javawebinar.topjava.model;


import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
public class Meal {
    @Setter
    private Integer id;
    protected final LocalDateTime dateTime;
    protected final String description;
    protected final int calories;

    public Meal(LocalDateTime dateTime, String description, int calories) {
        this(null, dateTime, description, calories);
    }

    public Meal(Integer id, LocalDateTime dateTime, String description, int calories) {
        this.id = id;
        this.dateTime = dateTime;
        this.description = description;
        this.calories = calories;
    }

    public boolean isNew() {
        return id == null;
    }


}
