package com.sample.di.demo4;

public class SmsMessenger implements Messenger {
	
	
	
	public void sendMessage(String to, String text) {
		System.out.println("SMS �ܹ� �޼��� ������");
		System.out.println(to);
		System.out.println(text);
	}
	
	public String recevieMessage() {
		System.out.println("�ޱ�");
		return "hi";
	}
	
}
