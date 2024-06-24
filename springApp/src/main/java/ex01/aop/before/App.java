package ex01.aop.before;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		// 스프링의 컨테이너 가져오기, 컨테이너 안에 bean에서 생성된 객체가 들어있다. 
		AbstractApplicationContext context = new GenericXmlApplicationContext("classpath:ex01/aop/before/applicationContext.xml");
		
		try {
			System.out.println("MethodBeforeAdvice...");
			
			TestService service = (TestService)context.getBean("testService");
			
			service.save("자바");
			System.out.println();
			
			service.write();
			System.out.println();
			
		} finally {
			context.close();
		}
	}
}
