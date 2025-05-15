package com.kh.practice.point.controller;

import com.kh.practice.point.model.vo.Circle;

public class CircleController {
	private Circle c = new Circle();
	private String radius;
	
	
	public String calcArea(int x, int y, int radius) {
		c = new Circle(x, y, radius);
		
		double result = Math.PI * radius *2;
		return"둘레: "+c+" / " +result;
	}
	
	
	

}
