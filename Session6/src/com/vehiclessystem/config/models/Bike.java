package com.vehiclessystem.config.models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Setter
@Getter
@Component
public class Bike extends Vehicles {
    private String brand;
    private VechilesType type;

}
