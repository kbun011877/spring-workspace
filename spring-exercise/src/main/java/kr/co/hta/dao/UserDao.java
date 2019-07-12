package kr.co.hta.dao;

import kr.co.hta.vo.User;

public interface UserDao {

	User getUserById(String userId);
	void addUser(User user);
	
}
