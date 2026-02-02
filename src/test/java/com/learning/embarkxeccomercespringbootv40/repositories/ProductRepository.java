package com.learning.embarkxeccomercespringbootv40.repositories;

import com.learning.embarkxeccomercespringbootv40.domain.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository extends JpaRepository<Product, Long> {
}
