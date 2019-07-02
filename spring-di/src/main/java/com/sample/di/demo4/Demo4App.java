package com.sample.di.demo4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo4App {

	public static void main(String[] args) {
		
		String re = "classpath:/com/sample/di/demo4/demo4.xml";
		ApplicationContext ctx = new ClassPathXmlApplicationContext(re);
		
		EventNoticeService s1 = ctx.getBean("event", EventNoticeService.class);
		OrderService s2 = ctx.getBean("order", OrderService.class);
		
		s1.notice("사은품 드립니다.");
		System.out.println();
		s2.sendOrderStatus();
		
		
		
	}
}
