package ex03.aop.interceptor;

import org.springframework.context.support.GenericXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		GenericXmlApplicationContext context = 
				new GenericXmlApplicationContext("classpath:ex03/aop/interceptor/applicationContext.xml");
		
		System.out.println("MethodInterceptor...\n");
		
		try {
			TestService service = (TestService) context.getBean("testService");
			
			service.save("스프링");
			System.out.println();
			
			service.write();
			System.out.println();
		} finally {
			context.close();
		}
		
	}
}
