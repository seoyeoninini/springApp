package com.user4;

public class User {
	private UserService userService;
	
	public User(UserService userService) {
		this.userService = userService;
	}
	
	public void write() {
		System.out.println(">> 컬렉션 타입 <<");
		System.out.println(userService.message());
	}
	
	
}
