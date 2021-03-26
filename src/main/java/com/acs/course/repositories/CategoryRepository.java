package com.acs.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.acs.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
