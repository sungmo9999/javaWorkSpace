package com.kh.chap05_method.controller;

public class MethodTest2 {
	/*
	 * static 메서드
	 * 
	 * - static매서드는 사용시" 객체를 생성할 필요가 없음".
	 * - 프로그램 시작시 정적메모리영역(static영역)에 메서드가 저장되어있기 떄문.
	 * - 호출방법 : 클래스명.메소드명(전달값)
	 *  */
	static int count = 1;
	int count2 = 2;
	
	public static int method(int num1) {
		
		System.out.println("매개변수와 반환형이 존재하는 static매서드");
		
		/*
		 * static매서드 안에서는 static이 아닌 일반 field맴버 접근 불가
		 * why?
		 * - 변수의 생성시점이 다르기 떄문
		 * - static메서드는 프로그램 시작시 정적메모리 영역의 공간이 할당되는데, 이때 static변수도
		 * 	 함께 할당 되기 때문에 static변수는 static메서드가 활동 가능.(생성시점이 같다)
		 * - 하지만, 일반 전역 변수는 객체 생성시점에 메모리에 공간이 할당 되므로 static메서드에서
		 *   사용가능하다.
		 *  */
		//return num1 * count2;
		return num1;
	}
	
	public int method1(int num1) {
		return num1 * count;
		
	}
	
	private MethodTest2() {
		
	}

}
