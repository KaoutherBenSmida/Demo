package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.models.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	
	@Query(value = "select * from user;", nativeQuery = true)
	public List<User> findAllSql();
 
}
