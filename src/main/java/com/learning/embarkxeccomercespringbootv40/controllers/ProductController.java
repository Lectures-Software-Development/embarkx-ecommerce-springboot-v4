package com.learning.embarkxeccomercespringbootv40.controllers;

import com.learning.embarkxeccomercespringbootv40.config.AppConstants;
import com.learning.embarkxeccomercespringbootv40.domain.entities.Product;
import com.learning.embarkxeccomercespringbootv40.repositories.ProductRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(AppConstants.BaseUrl + "/products")
public class ProductController {
    private final ProductRepository productRepository;

    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping
    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }
}
