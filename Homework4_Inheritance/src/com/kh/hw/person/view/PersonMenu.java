package com.kh.hw.person.view;

import java.util.Scanner;

import com.kh.hw.person.controller.PersonController;

public class PersonMenu {
	Scanner sc = new Scanner(System.in);
	PersonController pc = new PersonController();
	
	public void mainMenu() {
		while(true) {
		System.out.println("학생은 최대 3명까지 저장할 수 있습니다.");
		System.out.println("현재 저장된 학생은"+"명 입니다.");
		System.out.println("사원은 최대 3명까지 저장할 수 있습니다.");
		System.out.println("현재 저장된 사원은"+"명 입니다.");
		
		System.out.println("1. 학생 메뉴");
		System.out.println("2. 사원 메뉴");
		System.out.println("9. 끝내기");
		System.out.print("메뉴 번호 : ");
		int menu = sc.nextInt();
		sc.nextInt();
		
		switch(menu) {
		case 1:
			studentMenu();
			break;
		case 2:
			employeeMenu();
			break;
		case 9 :
			System.out.println("종료합니다");
			return;
			default:
				System.out.println("잘못 입력하셨습니다 다시 입력해 주세요");
		}
	  }
		
	}
	
	public void studentMenu() {
		
	}
	public void employeeMenu() {
		
	}
	public void insertStudent() {
		
	}
	public void printStudent() {
		
	}
	public void insertEmplotee() {
		
	}
	public void printEmplotee() {
		
	}
	
		
	
	

}
