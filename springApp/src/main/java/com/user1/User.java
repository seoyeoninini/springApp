package com.user1;

public class User {
	private UserService userService;
	
	// 인자가 있는 생성자
	// userService는 리퍼런스 타입(ref)
	public User(UserService userService) {
		this.userService = userService;
	}
	
	public void write() {
		String m = userService.message();
		
		System.out.println("-- 생성자를 이용한 의존성 주입 --");
		System.out.println(m);
	}
}
