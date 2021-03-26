package com.acs.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.acs.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
