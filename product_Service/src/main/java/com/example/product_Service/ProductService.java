package com.example.product_Service;

import jakarta.persistence.Cacheable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService
{
    @Autowired
    private ProductRepository productRepository;

    public Product addProduct(Product product)
    {
        return productRepository.save(product);
    }

    public Product updateStock(Long productId, Integer quantity) throws Exception
    {
        Product product = productRepository.findById(productId)
                .orElseThrow(() -> new Exception("Product not found"));
        if (product.getStockQuantity() < quantity) {
            throw new Exception("Insufficient stock");
        }
        product.setStockQuantity(product.getStockQuantity() - quantity);
        return productRepository.save(product);
    }

//    @Cacheable(value = true, key = "#productId")
    public Product getProductById(Long productId) throws Exception
    {
        return productRepository.findById(productId)
                .orElseThrow(() -> new Exception("Product not found"));
    }


}
