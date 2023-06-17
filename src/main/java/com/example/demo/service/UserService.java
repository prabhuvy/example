package com.example.demo.service;

import com.example.demo.entity.User;

public interface UserService {
  User registerUser(User user);
  User loginUser(String username,String password);
  User findUserByUsername(String username);
 
}
