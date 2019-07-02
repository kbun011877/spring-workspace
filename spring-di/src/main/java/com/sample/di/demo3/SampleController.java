package com.sample.di.demo3;

public class SampleController {
	
	private SampleDao sdao;
	
	public void setSdao(SampleDao sdao) {
		this.sdao = sdao;
	}
	
	public void add(String id, String password) {
		
		sdao.insert(id, password);
		
	}
	
	
}
