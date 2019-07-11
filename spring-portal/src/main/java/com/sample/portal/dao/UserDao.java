package com.sample.portal.dao;

import java.util.List;

import com.sample.portal.vo.User;

public interface UserDao {

	void addUser(User user);
	User getUserById(String userid);
	List<User> getUserByName(String userName);
}
