package com.anno.scope2;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;


public class App {
	public static void main(String[] args) {
		// 스프링의 컨테이너 가져오기, 컨테이너 안에 bean에서 생성된 객체가 들어있다. 
		AbstractApplicationContext context = new GenericXmlApplicationContext("classpath:com/anno/scope2/applicationContext.xml");
		
		try {
			User user = context.getBean(User.class);
			user.execute();
			user.execute();
			
			System.out.println("------------\n");
					
			
		} finally {
			context.close();
		}
	}
}
