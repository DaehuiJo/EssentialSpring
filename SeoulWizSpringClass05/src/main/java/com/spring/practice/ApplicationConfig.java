package com.spring.practice;

import java.util.ArrayList;
import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;

//@Configuration //Spring 설정에 사용되는 클레스임을 명시해주는 annotation
public class ApplicationConfig {

	@Bean //Bean 객체를 생성하기 위한 annotation
	public Student student1(){
		
		ArrayList<String> hobbys = new ArrayList<String>();
		hobbys.add("수영");
		hobbys.add("요리");
		
		Student student = new Student("홍길동", 20, hobbys);
		student.setHeight(180);
		student.setWeight(70);
		
		return student;
	}
	
	@Bean
	public Student student2(){
		
		ArrayList<String> hobbys = new ArrayList<String>();
		hobbys.add("독서");
		hobbys.add("영화감상");
		
		Student student = new Student("성춘향", 19, hobbys);
		student.setHeight(170);
		student.setWeight(54);
		
		return student;
	}
}
