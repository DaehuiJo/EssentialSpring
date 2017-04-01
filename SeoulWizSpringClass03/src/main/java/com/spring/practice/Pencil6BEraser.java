package com.spring.practice;

//public class Pencil6BEraser extends Pencil6B implements Pencil{
public class Pencil6BEraser implements Pencil{
	
	@Override
	public void use() {
		//super.use();
		System.out.println("6B굵기로 쓰이고, 지우개가 있습니다.");
	}

}
