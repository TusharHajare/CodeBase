package com.example.Order_Service;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "order_products")
public class OrderProduct
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long productId;
    private Integer quantity;
}
