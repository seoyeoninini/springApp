package com.anno.user3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
// 객체 생성 어노테이션
@Component
public class User2 {
	@Autowired
	@Qualifier("userServiceImpl")
	private UserService userService;
	
	public void write() {
		System.out.println("-- 애노테이션 : 동일객체가 두개 이상인 경우 --");
		System.out.println(userService.message());
	}
}
