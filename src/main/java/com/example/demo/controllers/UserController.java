package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.User;
import com.example.demo.service.UserService;

@CrossOrigin("*")
@RestController
@RequestMapping(path = "User/")
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping(value = "/allUsers")
	public List<User> getAllUsers() {

		return userService.findAll();
	}
	
	@GetMapping(value = "/allUsersSql")
	public List<User> getAllUsersSql() {

		return userService.findAllSql();
	}

}
