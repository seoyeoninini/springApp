package com.user1;

public class UserServiceImpl2 implements UserService {
	private String name;
	private String tel;
	private int age;
	
	public UserServiceImpl2() {
		this.name = "이자바";
		this.tel = "010-3452-1234";
		this.age = 17;
	}

	public UserServiceImpl2(String name, int age, String tel) {
		this.name = name;
		this.tel = tel;
		this.age = age;
	}
	
	@Override
	public String message() {
		
		String s = age >= 19 ? "성인" : "미성년자";
		
		String result = name + ":" + tel + ": " + age + ":" + s;
		
		return result;
	}

}
