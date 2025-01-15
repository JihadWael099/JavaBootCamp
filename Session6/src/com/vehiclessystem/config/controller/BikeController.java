package com.vehiclessystem.config.controller;


import com.vehiclessystem.config.dao.DAO;
import com.vehiclessystem.config.models.Bike;
import com.vehiclessystem.config.models.Vehicles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.PreparedStatement;
import java.sql.SQLException;

@Component
public class BikeController implements VehiclesController {

    private DAO dao;
    @Autowired
    public void setDao(DAO dao) {
        this.dao = dao;
    }
    @Override
    public void saveVehicle(Vehicles vehicle) {

        String sql = "INSERT INTO vehicle (type, brand) VALUES (?, ?)";
        try (PreparedStatement pstmt = dao.getConnection().prepareStatement(sql)) {
            //pstmt.setString(1, ((Bike) vehicle).getType().toString());
            pstmt.setString(2, ((Bike) vehicle).getBrand());
            pstmt.executeUpdate();
            System.out.println("Vehicle saved: " + ((Bike) vehicle).getBrand());
        } catch (SQLException e) {
            System.out.println("Error saving vehicle: " + e.getMessage());
        }
    }
}
