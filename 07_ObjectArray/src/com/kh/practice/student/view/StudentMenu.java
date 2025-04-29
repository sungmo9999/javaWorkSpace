package com.kh.practice.student.view;

import com.kh.practice.student.controller.StudentController;
import com.kh.practice.student.model.vo.Student;

public class StudentMenu {
	private StudentController ssm = new StudentController();

	public StudentMenu() {
		System.out.println("======학생 정보 출력======");
		
		Student arr[] = ssm.printStudent();
		for(int i = 0; i<arr.length; i++) {
			System.out.println(arr[i].inform());
		}
		
		System.out.println("======학생 성적출력======");
		double[] arr2 = ssm.avgScore();
		System.out.println("학생점수합계 : "+ (int)arr2[0]);
		System.out.println("학생점수평균 : "+arr2[1]);
		
		System.out.println("======성적 결과 출력======");
		for(Student std : arr) {
			System.out.println(std.getName()+"학생은: ");
			if(std.getScore() <StudentController.CUT_LINE) {
				System.out.println("재시험대상: ");
			}else {
				System.out.println("통과: ");
			}
		}
	   
		
		
		
	}
}
