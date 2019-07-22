package kr.co.hta.service;

import kr.co.hta.vo.User;

public interface UserService {
	boolean register(User user);
	User login(String id, String password);
}
