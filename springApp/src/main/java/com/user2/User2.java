package com.user2;

public class User2 {
	private UserService userService2;
	
	public User2(UserService userService2) {
		this.userService2 = userService2;
	}
	
	public void write() {
		String m = userService2.message();
		
		System.out.println("-- 생성자를 이용한 의존성 주입 : c : 네임스페이스 --");
		System.out.println(m);
	}
}
