package com.example.ProductDetails.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "products")
public class Product {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productId;
    
    @Column(nullable = false, unique = true)
    private String productName;
    
    @Column(nullable = false)
    private Double productPrice;
    
    @Column(nullable = false)
    private Integer productQuantity;
    
    @Column(nullable = false)
    private String productColor;
}
