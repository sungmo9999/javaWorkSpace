package com.kh.practice.point.controller;

import com.kh.practice.point.model.vo.Rectangle;

public class RectangleController {
	private Rectangle r = new Rectangle();
	
	public  String calaArea(int x, int y ,int width, int height) {
		r.setX(x);
		r.setY(y);
		r.setWidth(width);
		r.setHeight(height);
		double result = width*height;
		return "면적: "+ r.toString()+r+
		
		
	}
		
	

}
