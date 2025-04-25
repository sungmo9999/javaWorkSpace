package com.kh.chap03_field.model.vo;

public class FieldTest1 {
	/*
	 * 변수 구분
	 * - 전역 변수 : 클래스 영역 바로 아래 선언하는 변수들
	 * 				클래스내 어디서든 사용 가능하다.
	 * - 지역 변수 : 클래스 영역 내에서 특정영역({})에 선언한 변수.
	 * 				선언한 지역에서만 사용가능.
	 * 
	 * 1. 전역변수 
	 *  - 필드 == 인스턴스 변수 == 맴버 변수
	 *    생성시점 : 객체가 메모리에 할당 되면 함계 생성.
	 *    소멸시점 : 객체가 소멸할 때 함께 소멸 
	 *    
	 *  - 클래스변수 == static 변수
	 *	  생성시점 : 프로그램 시작과 선언동시에 ststic영역에 메모리 할당
	 *	  소멸시점 : 프로그램 종료시
	 *
	 * 2. 지역변수
	 * 	- 생성시점 : 특정영역({})이 할당될때
	 *    소멸시점 : 특정 구역이 종료 될때
	 *  */
	 
	private int global;
	
	public void test(int num) {
		
		int local = 0;
		
		
		if(true) {
			int a= 0;
		}
		//test 메서드를 사용하기위해 feilTest1객체를 생성하게
		//되면 global필드에는 항상 값이 초기화 된다(JVM)
		
		System.out.println(global);
		System.out.println(local);
		System.out.println(num);
		//System.out.println(a);
		
		
	}

}














