package com.anno.scope1;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;


public class App {
	public static void main(String[] args) {
		// 스프링의 컨테이너 가져오기, 컨테이너 안에 bean에서 생성된 객체가 들어있다. 
		AbstractApplicationContext context = new GenericXmlApplicationContext("classpath:com/anno/scope1/applicationContext.xml");
		
		try {
			// singleton
			Movie m1 = context.getBean(Movie.class);
			Movie m2 = context.getBean(Movie.class);
			if(m1 == m2) {
				System.out.println("Movie : 동일 객체");
			} else {
				System.out.println("Movie : 다른 객체");
			}
			m1.play();
			m2.play();
			
			System.out.println("-----------------\n");
			
			// prototype
			Music u1 = context.getBean(Music.class);
			Music u2 = context.getBean(Music.class);
			if(u1 == u2) {
				System.out.println("Music : 동일 객체");
			} else {
				System.out.println("Music : 다른 객체");
			}
			u1.play();
			u2.play();
			
		} finally {
			context.close();
		}
	}
}
