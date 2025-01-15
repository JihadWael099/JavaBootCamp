package com.vehiclessystem.config.dao;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Component
@Scope("singleton")
@Setter
@Getter

public class DAO {

    @Value("${database.url}")
    private String url;

    @Value("${database.username}")
    private String username;

    @Value("${database.password}")
    private String password;

    private Connection connection;

    private void dataBaseConnection(){
        try {
            connection = DriverManager.getConnection(url,username,password);
            System.out.println("Connection established successfully.");
        } catch (SQLException e) {
            System.out.println("Failed to establish connection: " + e.getMessage());
        }
    }

}
