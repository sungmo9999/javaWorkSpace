package com.kh.chap01_abstractiion.model.vo;

public class Student {
	
	//속성 / 필드부
	public String name;
	public int age;
	public double hight;
	
	//생성자 / 생성자부
	//===
	//기능
	public void student() {
		System.out.println("공부를 합시다");
	}
	
	public void fight( Student s) {
		String str = this.name + "학생과 "+s.name+"학생이싸웁니다";
		System.out.println(str);
	}

}











