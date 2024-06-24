package com.anno.user2;

import org.springframework.beans.factory.annotation.Autowired;

public class User {
	/*
	 - @Autowired 
	   : 타입으로 의존성 주입
	   : 동일한 타입이 둘 이상이면 필드명과 동일한 이름을 갖는 빈을 주입
	   : 동일한 타입이 둘 이상일때 필드명과 동일한 이름을 갖는 빈이 없으면 예외 발생
	 */
	
	
	@Autowired 
	// @Autowired는 타입으로 의존성을 주입
	private UserService userService;
	
	public void write() {
		System.out.println("-- 애노테이션 : 필드를 이용한 의존성 주입 --");
		System.out.println(userService.message());
	}
}
