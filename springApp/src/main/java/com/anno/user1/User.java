package com.anno.user1;

import org.springframework.beans.factory.annotation.Autowired;

public class User {
	@Autowired 
	private UserService userService;
	
	public void write() {
		System.out.println("-- 애노테이션 : 필드를 이용한 의존성 주입 --");
		System.out.println(userService.message());
	}
}
