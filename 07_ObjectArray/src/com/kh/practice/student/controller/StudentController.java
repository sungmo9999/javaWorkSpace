package com.kh.practice.student.controller;

import com.kh.practice.student.model.vo.Student;

public class StudentController {
	private Student[]sArr = new Student[5];
	
	sArr[0] = new student(김길동, 자바, 100);
	sArr[1] = new student(박길동, 디비, 50);
	sArr[2] = new student(이길동, 화면, 85);
	sArr[3] = new student(정길동, 서버, 60);
	sArr[4] = new student(홍길동, 자바, 20);

	
	public int CUT_LINE = 60;
	
	
	public StudentController() {
		
	}
	public Student[] printStudent() {
	

}
	public int sumScore() {
		
	}
	public double[] avgScore(){
		
	}
}


