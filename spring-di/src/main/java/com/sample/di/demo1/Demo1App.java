package com.sample.di.demo1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo1App {
	public static void main(String[] args) {
		
		String resource = "classpath:/com/sample/di/demo1/demo1.xml";
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext(resource);
		Sample1 sample1 = (Sample1)ctx.getBean("s1");
		
		String hi = sample1.hello();
		String bye = sample1.bye();
		
		System.out.println(hi);
		System.out.println(bye);
		
		Sample2 sample2 = ctx.getBean("s2", Sample2.class);
		
		String gr = sample2.greeting("ȫ�浿");
		
		System.out.println(gr);
		
	}
}
