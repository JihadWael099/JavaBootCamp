package com.vehiclessystem.config;

import com.vehiclessystem.config.controller.BikeController;
import com.vehiclessystem.config.controller.CarController;
import com.vehiclessystem.config.controller.PlaneController;

import com.vehiclessystem.config.models.Bike;
import com.vehiclessystem.config.models.Car;
import com.vehiclessystem.config.models.Plane;
import com.vehiclessystem.config.models.VechilesType;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        CarController carController = context.getBean(CarController.class);
        //BikeController bikeController = context.getBean(BikeController.class);
        PlaneController planeController = context.getBean(PlaneController.class);
        //VechilesType vechilesType = context.getBean(VechilesType.class);
        Car car=context.getBean(Car.class);
        car.setVechilesType(VechilesType.CAR);
        car.setBrand("frari");
        carController.saveVehicle(car);

      //  Bike bike=context.getBean(Bike.class);
//        bike.setType(VechilesType.BIKE);
//        bike.setBrand("kjdsjdh");

        Plane plane=context.getBean(Plane.class);
        plane.setType(VechilesType.PLANE);
        plane.setBrand("slkdjskljd");




    }
}