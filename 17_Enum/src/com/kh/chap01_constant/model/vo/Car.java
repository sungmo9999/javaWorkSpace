package com.kh.chap01_constant.model.vo;

public class Car {
	private String name;
	private int carColor;
	/*
	 * car클래스의 carcolor의 색깔을 관리할 정수의 값
	 * 0: black
	 * 1: red
	 * 2: blue
	 * 
	 */
	public static final int BLACK = 0;
	public static final int RED = 1;
	public static final int BLUE = 2;
	//상수의 단점: 의미없는 값으로 상수를 관리
	// - 변수명을 통해 의미를 확인할 수 있을뿐, 값자리에 의미가 없다
	// - 상수가 많이잘수록 관리가 힘듬
	
	public static final int GREEN = 3;
	public static final int TELLOE = 4;
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCarColor() {
		return carColor;
	}
	public void setCarColor(int carColor) {
		this.carColor = carColor;
	}
	
	private Color color;
	
	public void setColor(Color c) {
		this.color = c;
		
	}
	
	
	
	
	@Override
	public String toString() {
		return "Car [name=" + name + ", carColor=" + carColor + "]";
	}
	
	

}
