package ex01.aop.before;

import java.lang.reflect.Method;
import org.springframework.aop.MethodBeforeAdvice;

/* 
 - MethodBeforeAdvice
   : 대상 객체의 메소드를 실행하기 전에 공통 기능을 실행할 때 사용하는 Advice
   
 */

public class BeforeAdvice  implements MethodBeforeAdvice {

	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		String s;
		
		s = target.getClass() + " 클래스의 " + method.getName() + " 메소드를 호출 전..";
		s += "\n 매개변수 : ";
		if(args != null) {
			for (int i = 0; i < args.length; i++) {
				s += args[i] + " ";
			}
		}
		System.out.println(s);
	}

}
