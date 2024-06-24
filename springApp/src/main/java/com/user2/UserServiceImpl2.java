package com.user2;

public class UserServiceImpl2 implements UserService {
	private String name;
	private String tel;
	private int age;
	
	public UserServiceImpl2() {
		this.name = "김자바";
		this.tel = "010-1111-2222";
		this.age = 20;
	}


	public UserServiceImpl2(String name, int age, String tel) {
		this.name = name;
		this.tel = tel;
		this.age = age;
	}
	
	@Override
	public String message() {
		
		String s = age >= 19 ? "성인" : "미성년자";
		
		String result = name + "=" + tel + "=" + age + "=" + s;
		
		return result;
	}

}
