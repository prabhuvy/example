package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
@Service
public class UserServiceImpl implements UserService {
	
	private final UserRepository userRepository;
	
	

	public UserServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public User registerUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User loginUser(String username, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User findUserByUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}

}
