package com.example.demo.service;

import java.util.List;

import com.example.demo.models.User;

public interface UserService {
	
	public List<User> findAll();
	public List<User>findAllSql();

}
