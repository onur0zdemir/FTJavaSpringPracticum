package com.onurozdemir.FTJavaSpringPracticum.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "product_review")

public class ProductReview {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private long id;
    @Column(name = "review", nullable = false, length = 500)
    private String review;
    @Column(name = "review_date", nullable = false)
    private Date reviewDate;
    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;
    @ManyToOne
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;
}
