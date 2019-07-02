package com.sample.di.demo5;

public class PointDummyDao implements PointDao {
	
	public void updatePoint(String id, int point) {
		System.out.println("id: " + id +"\npoint: "+ point);
		System.out.println();
		
	}
}
