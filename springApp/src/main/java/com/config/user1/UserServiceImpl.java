package com.config.user1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service // 이 어노테이션이 없다면 Autowired(required=true) 오류가 나온다.
public class UserServiceImpl implements UserService {
	private @Value("다자바") String name;
	private @Value("20") int age;
	
	@Override
	public String message() {
		String s = name + " | " + age + " | " + (age >= 19 ? "성인" : "미성년자");
		
		return s;
	}
}
