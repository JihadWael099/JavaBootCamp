package com.vehiclessystem.config.models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Setter
@Getter
public class Car extends Vehicles {

    private String Brand;
    private VechilesType VechilesType;
}
