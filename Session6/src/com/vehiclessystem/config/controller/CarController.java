package com.vehiclessystem.config.controller;

import com.vehiclessystem.config.dao.DAO;
import com.vehiclessystem.config.models.Car;
import com.vehiclessystem.config.models.Vehicles;

import java.sql.PreparedStatement;

public class CarController implements VehiclesController{


    DAO dao;
    public CarController(DAO dao)
    {
        this.dao = dao;
    }
    @Override
    public void saveVehicle(Vehicles vehicle) {
        String sql="iINSERT INTO vehicle (type, brand) VALUES (?, ?)";
        try (PreparedStatement ps = dao.getConnection().prepareStatement(sql)) {
            ps.setString(1, ((Car) vehicle).getVechilesType().toString());
            ps.setString(2,((Car) vehicle).getBrand());
            ps.executeUpdate();
            System.out.println("Vehicle saved: " + ((Car) vehicle).getVechilesType().toString());

        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
