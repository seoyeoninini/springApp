package com.anno.user1;
// 생성자를 이용한 의존성 주입
import org.springframework.beans.factory.annotation.Autowired;

public class User3 {
	private UserService userService;
	
	@Autowired 
	public User3(UserService userService) {
		this.userService = userService;
	}


	public void write() {
		System.out.println("-- 애노테이션 : 생성자를 이용한 의존성 주입 --");
		System.out.println(userService.message());
	}
}
