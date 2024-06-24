package com.user4;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		// 스프링의 컨테이너 가져오기, 컨테이너 안에 bean에서 생성된 객체가 들어있다. 
		AbstractApplicationContext context = new GenericXmlApplicationContext("classpath:com/user4/applicationContext.xml");
		
		try {
			// 스프링 컨테이너에서 빈을 가져옴
			// User obj = (User)context.getBean("user"); //
			
			User obj = context.getBean(User.class);
			obj.write();
			System.out.println();
			
		} finally {
			context.close();
		}
	}
}
