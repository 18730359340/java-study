package com.tedu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tedu.pojo.User;
import com.tedu.service.UserService;

@RestController
public class UserController {
	@Autowired
	private UserService userService;
	@RequestMapping("/user")
	public List<User> getUser(){
		return userService.find();
	}
	
}
