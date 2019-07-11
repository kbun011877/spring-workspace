package com.sample.portal.service;

import java.util.List;

import com.sample.portal.vo.User;

public interface UserService {

	void registerUser(User user);
	User login(String id, String password);
	List<User> getUserByName(String name);
}
