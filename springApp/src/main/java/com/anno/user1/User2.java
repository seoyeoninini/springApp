package com.anno.user1;
// setter를 이용한 애노테이셤 : 한번 보기
import org.springframework.beans.factory.annotation.Autowired;

public class User2 {
	private UserService userService;
	
	@Autowired 
	public void setUserService(UserService userService) {
		this.userService = userService;
	}


	public void write() {
		System.out.println("-- 애노테이션 : setter를 이용한 의존성 주입 --");
		System.out.println(userService.message());
	}
}
