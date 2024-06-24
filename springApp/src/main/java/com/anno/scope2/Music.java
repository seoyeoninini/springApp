package com.anno.scope2;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;

// proxyMode는 객체가 생성될때 마다 생성. 
// 해당 객체에 접근(메소드 호출 등) 할때마다 새로운 객체가 생성
// movie와 다르게 객체 주소가 다르게 나온다.
@Service
@Scope(value = "prototype", proxyMode = ScopedProxyMode.TARGET_CLASS) 
public class Music {
	public void play() {
		System.out.println("음악 : " + toString());
	}
}
