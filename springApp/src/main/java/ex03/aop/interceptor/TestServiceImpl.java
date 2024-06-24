package ex03.aop.interceptor;

public class TestServiceImpl implements TestService {
	private String message;
	
	public TestServiceImpl() {
		message = "AOP 테스트 !!!";
	}
	
	@Override
	public void save(String value) {
		System.out.println("[save 메소드] ...");
		message = value;
	}

	@Override
	public void write() {
		System.out.println("[write 메소드] ...");
		
		// int a = Integer.parseInt("a");
		
		System.out.println(message);
	}
}
