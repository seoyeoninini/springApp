package com.anno.user3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
// 객체 생성 어노테이션
@Component
public class User {
	@Autowired 
	private UserService userService;
	
	public void write() {
		System.out.println("-- 애노테이션 : @Component - bean 생성 --");
		System.out.println(userService.message());
	}
}
