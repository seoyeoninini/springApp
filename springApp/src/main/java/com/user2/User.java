package com.user2;

public class User {
	private UserService userService;
	
	// 인자가 있는 생성자
	// userService는 리퍼런스 타입(ref)
	
	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	public void init() {
		System.out.println("초기화는 여기서...");
	}

	public void write() {
		String m = userService.message();
		
		System.out.println("-- setter를 이용한 의존성 주입 --");
		System.out.println(m);
	}
	
	public void destroy() {
		System.out.println("객체 소멸전 호출 ...");
	}
}
