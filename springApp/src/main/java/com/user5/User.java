package com.user5;

public class User {
	private UserService userService;
	
	public User(UserService userService) {
		this.userService = userService;
	}
	
	public void disp() {
		System.out.println("-- 프로퍼티 파일 읽어 오기 --");
		System.out.println(userService.msg());
	}
}
