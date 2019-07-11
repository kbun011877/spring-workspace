package com.sample.portal.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ibatis.SqlMapClientTemplate;
import org.springframework.stereotype.Repository;

import com.sample.portal.vo.User;

@Repository
public class UserDaoImpl implements UserDao{
	
	@Autowired
	private SqlMapClientTemplate template;
	
	@Override
	public void addUser(User user) {
		template.insert("user.addUser", user);
	}
	
	@Override
	public User getUserById(String userid) {
		return (User) template.queryForObject("user.getUserById", userid);
	}
	
	@Override
	public List<User> getUserByName(String userName) {
		return template.queryForList("user.getUserByName", userName);
	}
	
}
