package kr.co.hta.service;

import kr.co.hta.vo.User;

public interface UserService {

	void registerUser(User user);
	User login(String id);
	User getUser(String id);
}
