package com.onurozdemir.FTJavaSpringPracticum.repository;

import com.onurozdemir.FTJavaSpringPracticum.model.Customer;
import com.onurozdemir.FTJavaSpringPracticum.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    Customer findCustomerById(Long id);

}
