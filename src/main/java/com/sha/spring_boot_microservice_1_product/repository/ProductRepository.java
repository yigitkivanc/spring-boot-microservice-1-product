package com.sha.spring_boot_microservice_1_product.repository;

import com.sha.spring_boot_microservice_1_product.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {



}
