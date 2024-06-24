package com.anno.user2;

public class UserServiceImpl implements UserService {
	private String name;
	private String tel;
	private int age;
	
	public UserServiceImpl() {
		name = "김자바";
		tel = "010-1111-2222";
		age = 20;
	}

	@Override
	public String message() {
		String s= name + " : " + tel + " : " + age;
		s += age >= 19? " 성인" : " 미성년자";
		
		return s;
	}

}
