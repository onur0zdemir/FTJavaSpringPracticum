package com.onurozdemir.FTJavaSpringPracticum.repository;

import com.onurozdemir.FTJavaSpringPracticum.model.Customer;
import com.onurozdemir.FTJavaSpringPracticum.model.Product;
import com.onurozdemir.FTJavaSpringPracticum.model.ProductReview;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface ProductReviewRepository extends JpaRepository<ProductReview, Long> {
    List<ProductReview> findProductReviewsByProduct(Product product);

    List<ProductReview> findProductReviewsByProductAndReviewDateBetween(Product product, Date startDate, Date endDate);

    List<ProductReview> findProductReviewsByCustomer(Customer customer);

    List<ProductReview> findProductReviewsByCustomerAndReviewDateBetween(Customer customer, Date startDate, Date endDate);
}
