package com.user3;

public class UserServiceImpl implements UserService {
	private String name;
	private String tel;
	private int score;
	
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

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String message() {
		String p = score >= 60 ? "합격" : "불합격";
		
		String s = String.format("이름:%s, 전화:%s, 점수:%d, 결과:%s", name, tel, score, p );
		
		return s;
	}
	
}
