package com.onurozdemir.FTJavaSpringPracticum.service;

import com.onurozdemir.FTJavaSpringPracticum.model.Product;
import com.onurozdemir.FTJavaSpringPracticum.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.time.Instant;
import java.util.List;
@Service
public class ProductService {
    ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> findExpiredProducts() {
        return productRepository.findProductsByExpirationDateBefore(Date.from(Instant.now()));
    }

    public List<Product> findNonExpiredProducts() {
        return productRepository.findProductsByExpirationDateAfterOrExpirationDateIsNull(Date.from(Instant.now()));
    }
}
