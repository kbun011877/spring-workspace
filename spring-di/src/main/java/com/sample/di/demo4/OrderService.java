package com.sample.di.demo4;

public class OrderService {
	
	private Messenger messenger;
	public void setMessenger(Messenger messenger) {
		this.messenger = messenger;
	}
	
	public void sendOrderStatus() {
		System.out.println("주문 알림 보내기");
		messenger.sendMessage("010-2222-2222", "발송준비중...");
	}
}
