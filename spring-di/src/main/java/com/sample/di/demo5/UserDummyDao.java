package com.sample.di.demo5;

public class UserDummyDao implements UserDao {
	
	public void insertUser(String name, String id, String password) {
		System.out.println("name: " + name +"\nid: " + id +"\npwd: "+ password);
		System.out.println();
		
	}
}
