package com.config.user2;

import org.springframework.beans.factory.annotation.Value;

public class UserServiceImpl implements UserService {
	private @Value("다자바") String name;
	private @Value("20") int age;
	
	@Override
	public String message() {
		String s = name + " | " + age + " | " + (age >= 19 ? "성인" : "미성년자");
		
		return s;
	}
}
