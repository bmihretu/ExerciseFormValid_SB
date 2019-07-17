package com.example.demo;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class car {
    @NotNull
    @Size(min=4,max=20)
    private String car_name;
    @NotNull
    @Size(min=3,max=15)
    private String car_type;
    @NotNull
    @Size(min=10,max=35)
    private String description;

    public car() {
    }

    public String getCar_name() {
        return car_name;
    }

    public void setCar_name(String car_name) {
        this.car_name = car_name;
    }

    public String getCar_type() {
        return car_type;
    }

    public void setCar_type(String car_type) {
        this.car_type = car_type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}