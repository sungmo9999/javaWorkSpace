package com.kh.practice.point.controller;

import com.kh.practice.point.model.vo.Rectangle;

public class RectangleController {
	private Rectangle r = new Rectangle();
	
	public String calaArea(int x, int y ,int width, int height) {
		r = new Rectangle(x, y, width, height);
		double result = width* height;
		return "높이 : "+ r +"/"+result ;
		
		
	}
		
	

}
