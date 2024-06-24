package com.anno.user2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class User2 {
	/*
	  - @Qualifier
	    : @Autowired와 함께 사용(단독 사용 불가)
	    : 이름으로 설정하여 의존성 주입

		[사용예시]
	    변수명이 userService가 아닌 service일때(=필드명과 동일한 이름이 없을 경우)
	    => @Autowired와 함께 @Qualifier("userService2")사용
	 */

	@Autowired 
	@Qualifier("userService2")
	private UserService service;
	
	public void write() {
		System.out.println("-- 애노테이션 : 동일한 타입이 둘 이상인 경우 - @Autowired, @Qualifier --");
		System.out.println(service.message());
	}
}
