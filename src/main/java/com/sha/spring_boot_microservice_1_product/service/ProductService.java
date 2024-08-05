package com.sha.spring_boot_microservice_1_product.service;

import com.sha.spring_boot_microservice_1_product.model.Product;

import java.util.List;

public interface ProductService {
    Product saveProduct(Product product);
    void deleteProduct(Long productId);

    List<Product> findAllProducts();
}
