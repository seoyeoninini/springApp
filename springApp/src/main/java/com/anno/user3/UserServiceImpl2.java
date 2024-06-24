package com.anno.user3;

import org.springframework.stereotype.Component;
/*
 - @Component
   : 빈 생성
   : 이름을 부여하지 않으면 클래스명의 첫글자를 소문자로한 이름이 된다.
     클래스명이 UserServiceImpl 이면 빈의 이름은 userServiceImpl
 */

@Component("userService") // 이름 부여
public class UserServiceImpl2 implements UserService {
	private String name;
	private String tel;
	private int age;
	
	public UserServiceImpl2() {
		name = "이자바";
		tel = "010-1111-2222";
		age = 17;
	}

	@Override
	public String message() {
		String s= name + " , " + tel + " , " + age + " , ";
		s += age >= 19? "성인" : "미성년자";
		
		return s;
	}

}
