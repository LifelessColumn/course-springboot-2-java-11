package com.acs.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.acs.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
