package com.java.practice;

public class MyCalculator {

	public Calculator calculator;
	private int firstNum;
	private int secondNum;
	
	public MyCalculator(){}
	
	public void add(){
		calculator.addtion(firstNum, secondNum);
	}
	
	public void sub(){
		calculator.substraction(firstNum, secondNum);
	}
	
	public void mul(){
		calculator.multiplication(firstNum, secondNum);
	}
	
	public void div(){
		calculator.division(firstNum, secondNum);
	}
	
	
	//xml에서 beans-property 값을 할당해주기 위해 변수의 setter 설정!!
	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}

	public void setFirstNum(int firstNum) {
		this.firstNum = firstNum;
	}

	public void setSecondNum(int secondNum) {
		this.secondNum = secondNum;
	}
	
	
}
