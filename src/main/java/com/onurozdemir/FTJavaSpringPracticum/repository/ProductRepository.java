package com.onurozdemir.FTJavaSpringPracticum.repository;

import com.onurozdemir.FTJavaSpringPracticum.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

    Product findProductById(Long id);

    List<Product> findProductsByExpirationDateBefore(Date end);

    List<Product> findProductsByExpirationDateAfterOrExpirationDateIsNull(Date start);
}
