package com.user1;

public class UserServiceImpl implements UserService {
	private String name;
	private String tel;
	private int age;
	
	public UserServiceImpl() {
		this.name = "김자바";
		this.tel = "010-1111-2222";
		this.age = 20;
	}
	
	@Override
	public String message() {
		
		String s = age >= 19 ? "성인" : "미성년자";
		
		String result = name + "," + tel + ", " + age + "," + s;
		
		return result;
	}

}
