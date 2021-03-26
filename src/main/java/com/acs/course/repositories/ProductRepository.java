package com.acs.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.acs.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
