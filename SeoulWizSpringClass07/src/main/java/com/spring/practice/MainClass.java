package com.spring.practice;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args){
		
		//container 생성
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		
		//container 설정
		ctx.load("classpath:applicationCTX.xml");
		
		//초기화
		ctx.refresh();
		
		//사용
		Student student = ctx.getBean("student", Student.class);
		System.out.println("이름: "+student.getName());
		System.out.println("나이: "+student.getAge());
		
		//종료
		ctx.close();
	}
}
