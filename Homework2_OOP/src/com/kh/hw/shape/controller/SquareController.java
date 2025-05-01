package com.kh.hw.shape.controller;

import com.kh.hw.shape.model.vo.Shape;

public class SquareController {
	private Shape s = new Shape();

	public double calcPerimeter(double height, double width) {
		return (height*2+ width*2);		
		
	}
	public double calcArea(double height, double width) {
		return (height*width);
		
	}
	
	public void paintColor(String color) {
		
	}
	public void printColor(String color) {
		
	}
	public String print() {
		return "사각형"+s.information();
		
	}
	
	
}
