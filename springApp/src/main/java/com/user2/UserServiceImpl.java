package com.user2;

public class UserServiceImpl implements UserService {
	private String name;
	private String tel;
	private int age;
	
	public UserServiceImpl() {
		this.name = "김자바";
		this.tel = "010-1111-2222";
		this.age = 20;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	@Override
	public String message() {
		
		String s = age >= 19 ? "성인" : "미성년자";
		
		String result = name + "," + tel + ", " + age + "," + s;
		
		return result;
	}

}
