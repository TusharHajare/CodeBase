package com.example.Order_Service;

import com.example.product_Service.Product;
import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Order
{
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long orderId;
        private String customerName;
        private LocalDateTime orderDate;

        @OneToMany(cascade = CascadeType.ALL)
        @JoinColumn(name = "order_id")
        private List<Product> products = new ArrayList<>();
}
