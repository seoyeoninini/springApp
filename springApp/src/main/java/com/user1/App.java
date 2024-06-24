package com.user1;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		// 스프링의 컨테이너 가져오기, 컨테이너 안에 bean에서 생성된 객체가 들어있다. 
		AbstractApplicationContext context = new GenericXmlApplicationContext("classpath:com/user1/applicationContext.xml");
		
		try {
			// 스프링 컨테이너에서 빈을 가져옴
			// new를 하지 않아도 스프링이 new를 해줌. 그러나 스프링에게 객체 생성하라고 해야 함. (application.xml에서 bean 태그로 생성)
			User obj = (User)context.getBean("user"); // getBean은 object로 다운 캐스팅 해야 함
			obj.write();
			
		} finally {
			context.close();
		}
	}
}
