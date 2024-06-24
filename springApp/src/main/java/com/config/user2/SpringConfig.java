package com.config.user2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration // 스프링 환경 설정 파일
@ComponentScan(basePackages = {"com.config.user2"} )
public class SpringConfig {
	
	/*
	 - @Bean
	   : 외부 라이브러리의 객체를 생성하는 경우 사용
	   : 하나 이상의 @Bean 애노테이션을 사용하는 경우 @Configuration이 필요
	   : 빈의 이름은 기본으로 메소드명'
	   
	   - 내가 만든건 @Servce라고 붙이고 외부에서 객체를 생성하는 경우 @Bean을 사용한다. 
	 */
	
	@Bean
	public UserService userServiceDevice() {
		return new UserServiceImpl();
	}
	
	@Bean(name = "user2.user", initMethod = "init", destroyMethod = "destroy")
	public User userDevice() {
		return new User();
	}
}
