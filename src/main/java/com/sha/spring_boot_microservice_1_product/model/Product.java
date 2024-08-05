package com.sha.spring_boot_microservice_1_product.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "Product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name", length = 100, nullable = false)
    private String name;

    @Column(name = "price",nullable = false)
    private Double price;

    @Column(name="create_time",nullable = false)
    private LocalDateTime createTime;
}
