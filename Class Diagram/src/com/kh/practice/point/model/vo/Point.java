package com.kh.practice.point.model.vo;

public class Point {
	
	protected int x;
	protected int y;
	
	public Point() {
	
}
	public Point(int x, int y) {
		super();
		this.x = x; 
		this.y = y;
}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public String toString() {
		return x+","+y;
	}


}
