package com.example.Order_Service;

import com.example.product_Service.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

@FeignClient(name = "product_service", url = "http://localhost:8089/api/product")
public interface ProductFeignClient
{
    @GetMapping("/{id}")
    Product getProductById(@PathVariable("id") Long id);

    @PutMapping("/{id}/update-stock/{quantity}")
    Product updateStock(@PathVariable("id") Long id, @PathVariable("quantity") Integer quantity);

}
