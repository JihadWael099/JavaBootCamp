package com.vehiclessystem.config.controller;

import com.mysql.jdbc.PreparedStatement;
import com.vehiclessystem.config.dao.DAO;
import com.vehiclessystem.config.models.Plane;
import com.vehiclessystem.config.models.Vehicles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.SQLException;

@Component
public class PlaneController implements VehiclesController {

    @Autowired
    DAO dao;

    @Override
    public void saveVehicle(Vehicles vehicle) {
        String sql = "INSERT INTO vehicle (type, brand) VALUES (?, ?)";
        try (PreparedStatement pstmt = (PreparedStatement) dao.getConnection().prepareStatement(sql)) {
            pstmt.setString(1, ((Plane) vehicle).getType().toString());
            pstmt.setString(2,((Plane) vehicle).getBrand());
            pstmt.executeUpdate();
            System.out.println("Vehicle saved: " + ((Plane) vehicle).getBrand());
        } catch (SQLException e) {
            System.out.println("Error saving vehicle: " + e.getMessage());
        }
    }
}
