package com.anno.user2;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
/*
- @Resource 
  : @Autowired + @Qualifier 
  : 이름으로 의존성 주입
  : java가 제공
  : JDK 9 부터는 다음의 라이브러리가 필요
    -> Maven 사이트에서 javax annotation 검색 후 pom.xml에 코드 복붙
    <dependency>
	    <groupId>javax.annotation</groupId>
	    <artifactId>javax.annotation-api</artifactId>
	    <version>1.3.2</version>
	</dependency>
	
	- @PostConstruct, @PreDestroy
	 : 생성자 호출 후, 객체 생성전 호출
	 : java에서 제공
	 : JDK 9부터는 javax.annotation 라이브러리 필요
*/
public class User3 {
	
	@Resource(name = "userService2")
	private UserService service;
	
	@PostConstruct
	public void init() {
		System.out.println("초기화...");
	}
	
	public void write() {
		System.out.println("-- 애노테이션 : 동일한 타입이 둘 이상인 경우 - @Resource --");
		System.out.println(service.message());
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("객체 소멸전...");
	}
}
