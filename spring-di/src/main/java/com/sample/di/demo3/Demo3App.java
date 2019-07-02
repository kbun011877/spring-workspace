package com.sample.di.demo3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo3App {

	public static void main(String[] args) {
		
		String re = "classpath:/com/sample/di/demo3/demo3.xml";
		ApplicationContext ctx = new ClassPathXmlApplicationContext(re);
		
		SampleController con = ctx.getBean("controller", SampleController.class);
		
		con.add("kk", "zxcv1234"); 
		
		
		
	}
}
