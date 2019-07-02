package com.sample.di.demo4;

public class SmsMessenger implements Messenger {
	
	
	
	public void sendMessage(String to, String text) {
		System.out.println("SMS 단문 메세지 보내기");
		System.out.println(to);
		System.out.println(text);
	}
	
	public String recevieMessage() {
		System.out.println("받기");
		return "hi";
	}
	
}
