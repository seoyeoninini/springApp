package com.anno.scope1;

import org.springframework.stereotype.Service;

@Service
public class User {
	private Movie movie;
	private Music music;
	
	public void execute() {
		System.out.println(" -- proxyMode --");
		movie.play();
		music.play();
	}
}
