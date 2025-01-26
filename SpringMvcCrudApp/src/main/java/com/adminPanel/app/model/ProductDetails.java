package com.adminPanel.app.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Setter
@Getter
@NoArgsConstructor
@Table(name = "product_details")
public class ProductDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    @NotBlank(message = "Name cannot be blank")
    private String name;

    @Column(name = "expiration_date")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @NotNull(message = "Expiration date cannot be null")
    private Date expirationDate;

    @Column(name = "manufacturer")
    @NotBlank(message = "Manufacturer cannot be blank")
    private String manufacturer;

    @Column(name = "price")
    @NotNull(message = "Price cannot be null")
    private Double price;

    @Column(name = "available")
    @NotNull(message = "Availability cannot be null")
    private Boolean available;

    @OneToOne
    @JoinColumn(name = "product_id")
    private Product product;
}