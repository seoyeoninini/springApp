package com.anno.scope1;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope(value = "prototype") // getBean()으로 객체를 반환 받을때 ㅁ
public class Music {
	public void play() {
		System.out.println("음악 : " + toString());
	}

}
