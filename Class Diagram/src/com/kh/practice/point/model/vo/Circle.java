package com.kh.practice.point.model.vo;

public class Circle extends Point {
	
	private int radius;
	
	public Circle() {
		
	}
	
	public Circle(int x, int y, int radius) {
		super();
		super.setX(x);
		super.setY(y);
		
		
		super.x = x;
		super.y = y;
		this.radius = radius;
		
	 }

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	public String toString() {
		return super.toString()+", "+radius;
	}
	
	
	  
		
		
	
		
	
	

  
}
