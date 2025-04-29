package com.kh.practice.point.controller;

import com.kh.practice.point.model.vo.Circle;

public class CircleController {
	private Circle c = new Circle();
	private String radius;
	
	
	public String calcCircum(int x, int y, int radius) {
		c.setX(x);
		c.setY(y);
		c.setRadius(radius);
		
		double result = Math.PI * radius *2;
		return"둘레: "+c+" / " +result;
	}
	
	
	

}
