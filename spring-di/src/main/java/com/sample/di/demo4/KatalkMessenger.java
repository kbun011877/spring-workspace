package com.sample.di.demo4;

public class KatalkMessenger implements Messenger{
	
	public String recevieMessage() {
		System.out.println("ī������ �޼��� �����ϱ�");
		return "����: �ݰ����ϴ�.";
	}
	
	public void sendMessage(String to, String text) {
		System.out.println("ī������ �޼��� ������");
		System.out.println("�޴� ���: " + to);
		System.out.println("�޼��� ����: " + text);
	}
}
