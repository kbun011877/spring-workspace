package com.sample.di.demo9;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo9App {

	public static void main(String[] args) {
		
		String resourcce = "classpath:/com/sample/di/demo9/demo9.xml";
		ApplicationContext ctx = new ClassPathXmlApplicationContext(resourcce);
		
		MailConnectService service = ctx.getBean(MailConnectService.class);
		service.connect();
		
		
	}
}
