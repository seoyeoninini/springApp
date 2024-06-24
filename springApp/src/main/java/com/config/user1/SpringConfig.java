package com.config.user1;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
// java를 통해 객체를 찾아낸다.
@Configuration // 스프링 환경 설정 파일
@ComponentScan(basePackages = {"com.config.user1"} )
public class SpringConfig {
	
}
