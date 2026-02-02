package com.learning.embarkxeccomercespringbootv40.repositories;

import com.learning.embarkxeccomercespringbootv40.domain.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
