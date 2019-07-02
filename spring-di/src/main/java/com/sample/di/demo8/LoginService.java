package com.sample.di.demo8;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LoginService {
	
	@Autowired
	private UserDao userDao;
	
	public void login(String id, String pwd) {
		String password = userDao.getPqsswordById(id);
		System.out.println(password);
		
		if(pwd.equals(password)) {
			System.out.println("일치");
		} else {
			System.out.println("불일치");
		}
	}
}
