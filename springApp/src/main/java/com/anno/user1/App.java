package com.anno.user1;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;


public class App {
	public static void main(String[] args) {
		// 스프링의 컨테이너 가져오기, 컨테이너 안에 bean에서 생성된 객체가 들어있다. 
		AbstractApplicationContext context = new GenericXmlApplicationContext("classpath:com/anno/user1/applicationContext.xml");
		
		try {
			// 스프링 컨테이너에서 빈을 가져옴
			User obj = context.getBean(User.class); 
			// getBean은 object로 다운 캐스팅 해야 하는데 User.class라고 쓰면 안해도 됨 
			// User obj = (User)context.getBean("user"); // 다운캐스팅 한 경우. 위와 동일한 코드
			
			// 필드를 이용한 의존성 주입
			obj.write();
			System.out.println("---------------\n");
			
			// setter를 이용한 의존성 주입
			User2 obj2 = context.getBean(User2.class); 
			obj2.write();
			System.out.println("---------------\n");
			
			// 생성자를 이용한 의존성 주입
			User3 obj3 = context.getBean(User3.class); 
			obj3.write();
			System.out.println("---------------\n");
			
		} finally {
			context.close();
		}
	}
}
