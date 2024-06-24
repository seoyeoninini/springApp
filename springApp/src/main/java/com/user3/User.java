package com.user3;

public class User {
	private UserService userService;

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	public void write() {
		System.out.println(">> 프로퍼티를 이용한 의존성 주입 <<");
		System.out.println(userService.message());
	}

}
