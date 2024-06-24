package com.anno.user2;

import org.springframework.beans.factory.annotation.Value;

public class UserServiceImpl2 implements UserService {
	@Value("다자바") // 이렇게 값을 넣을수도 있는데 그냥 13번 처럼 하기
	private String name;
	@Value("010-7788-9988")
	private String tel;
	@Value("19")
	private int age;
	
	public UserServiceImpl2() {
		/*
		name = "홍홍홍";
		tel = "010-1111-2222";
		age = 17;
		*/
	}

	@Override
	public String message() {
		String s= name + " , " + tel + " , " + age;
		s += age >= 19? " 성인" : " 미성년자";
		
		return s;
	}

}
