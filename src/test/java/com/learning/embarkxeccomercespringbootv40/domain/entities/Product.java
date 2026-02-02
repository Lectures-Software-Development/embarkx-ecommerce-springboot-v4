package com.learning.embarkxeccomercespringbootv40.domain.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

import java.util.Collection;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long productId;

    @NotBlank
    @Size(min = 3, message = "Name must be at least 3 characters long")
    private String name;

    @NotBlank
    @Size(min = 6, message = "Description must be at least 6 characters long")
    private String description;

    private Integer quantity;
    private Long discount;
    private Double price;
    private Double specialPrice;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    private Category category;

}
