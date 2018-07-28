package com.tedu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tedu.mapper.UserMapper;
import com.tedu.pojo.User;
import com.tedu.service.UserService;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper userMapper;
	@Override
	public List<User> find() {
		// TODO Auto-generated method stub
		return userMapper.find();
	}

}
