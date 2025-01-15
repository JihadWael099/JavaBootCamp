package com.vehiclessystem.config.models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Setter
@Getter
public class Plane extends Vehicles{

    private String brand;
    private VechilesType type;

}
