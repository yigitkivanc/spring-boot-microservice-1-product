package com.sha.spring_boot_microservice_1_product.service;

import com.sha.spring_boot_microservice_1_product.model.Product;
import com.sha.spring_boot_microservice_1_product.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductRepository productRepository;


    @Override
    public Product saveProduct(Product product) {
        product.setCreateTime(LocalDateTime.now());
        return productRepository.save(product);
    }

    @Override
    public void deleteProduct(Long productId) {
        productRepository.deleteById(productId);
    }

    @Override
    public List<Product> findAllProducts(){
        return productRepository.findAll();
    }
}
