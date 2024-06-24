package com.config.user3;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

// @Value("${프로퍼티이름})") => 프로퍼티 값 반환
@Service
public class UserServiceImpl implements UserService {
	private @Value("${join.name}") String name; // test.properties에서 넣은 값으로 나온다.
	private @Value("${join.age}") int age;
	private @Value("${join.tel}") String tel;
	
	@Override
	public String message() {
		String s = name + " | " + age + " | " + tel + " | " + (age >= 19 ? "성인" : "미성년자");
		
		return s;
	}
}
