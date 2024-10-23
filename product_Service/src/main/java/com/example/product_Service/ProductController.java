package com.example.product_Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(("/api/product"))
public class ProductController
{
    @Autowired
    private ProductService productService;

    @PostMapping
    public Product addProduct(@RequestBody Product product)
    {
        return productService.addProduct(product);
    }

    @PutMapping("/{productId}/update-stock/{quantity}")
    public Product updateStock(@PathVariable Long productId, @PathVariable Integer quantity) throws Exception
    {
        return productService.updateStock(productId, quantity);
    }

    @GetMapping("/{productId}")
    public Product getProductById(@PathVariable Long productId) throws Exception
    {
        return productService.getProductById(productId);
    }
}



