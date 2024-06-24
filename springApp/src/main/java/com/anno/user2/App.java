package com.anno.user2;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;


public class App {
	public static void main(String[] args) {
		// 스프링의 컨테이너 가져오기, 컨테이너 안에 bean에서 생성된 객체가 들어있다. 
		AbstractApplicationContext context = new GenericXmlApplicationContext("classpath:com/anno/user2/applicationContext.xml");
		
		try {
			// 스프링 컨테이너에서 빈을 가져옴
			User obj = context.getBean(User.class); 
			obj.write();
			System.out.println("---------------\n");

			User2 obj2 = context.getBean(User2.class); 
			obj2.write();
			System.out.println("---------------\n");
			
			User3 obj3 = context.getBean(User3.class); 
			obj3.write();
			System.out.println("---------------\n");
			
			
		} finally {
			context.close();
		}
	}
}
