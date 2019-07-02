package com.sample.di.demo5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo5App {

	public static void main(String[] args) {
		
		String re = "classpath:/com/sample/di/demo5/demo5.xml";
		ApplicationContext ctx = new ClassPathXmlApplicationContext(re);
		
		PointDao pdao = ctx.getBean("pointDao", PointDao.class);
		UserDao udao = ctx.getBean("userDao", UserDao.class);
		
		pdao.updatePoint("hong", 10);
		
		udao.insertUser("ȫ�浿", "hong", "zxcv1234");
		
		
		
	}
}
