package com.kh.hw.shape.model.vo;

public class Shape {
	
	private int type;
	private double height;
	private double width;
	private String color = "white";


	public Shape() {
	
  }
	
	public Shape(int type, double height, double width) {
		this.type = type;
		this.height = height;
		this.width = width;
		
	}
	public void setType(int type) {
		this.type = type;
	}
	public int getInt() {
		return type;
	}
	
	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String information() {
		return height+" "+width+" "+color;
	}
}
