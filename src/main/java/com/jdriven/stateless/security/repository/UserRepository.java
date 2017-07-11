package com.jdriven.stateless.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jdriven.stateless.security.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByUsername(String username);

}
