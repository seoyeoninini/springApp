package ex01.aop.before;

public class TestServiceImpl implements TestService {
	private String value = "AOP 예제 !!";
	
	@Override
	public void save(String value) {
		System.out.println("[save 메소드] ... ");
		this.value = value;
	}

	@Override
	public void write() {
		System.out.println("[write 메소드] ..");
		System.out.println(value);
	}

}
