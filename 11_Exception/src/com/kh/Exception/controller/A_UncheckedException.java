package com.kh.Exception.controller;

import java.util.InputMismatchException;
import java.util.Scanner;

public class A_UncheckedException {
	
	/*
	 * UnccheckedException
	 * -예외처리가 필수가 아닌 예외클래스
	 * 
	 * RuntimeException
	 * -프로그램실행시 발생하는 예외클래스
	 * -ArrayIndexOutOfBoundsException
	 * -NullPointerException
	 * -ClassCastException
	 * -ArithmeticException
	 * -NegativeArraySizeException
	 * 
	 * =>RuntimeException께열들은 충분히 예측 간으한 에러들 이므로, 예외자체가
	 *   발생하지 않게끔 조건문으로 처리하는게 가장 좋다.
	 *   즉, 굳이 예외처리를 할 필요가 없다.
	 * 
	 * 
	 */
	Scanner sc =  new Scanner(System.in);
	public void method1() {
		System.out.println("첫 번째 정수 : ");
		int num1 = sc.nextInt();
		
		System.out.println("두 번째 정수 : ");
		int num2 = sc.nextInt();
		
		//예외를 발생시키지 않게 코드적으로 처리하는 방법
		if(num2 !=0) {
		System.out.println("나눗셈 연산결과 : "+(num1/num2));
	}else {
		System.out.println("0으로 나누지마세요");
	}
		
		//예외처리구문으로 해결
		/*
		 * try~catch문
		 * 
		 * try{
		 *   //예외가 발생할 수있는코드
		 * }catch(발새될 예외 클래스 변수명){
		 *   //try코드 안에서 예외가 발생한 경우 실행할 코드
		 * }
		 */
		
		try {
			System.out.println("나눗셈 연산 2회차 :"+num1/num2);
		}catch(ArithmeticException e) {
			System.out.println("0으로 나누지좀 마세요");
			e.printStackTrace();//발생한 오류를 추적
		}
	System.out.println("프로그램종료");
	}
	public void method2() {
		System.out.print("정수입력(0빼고) : ");
		
		try {
			int num = sc.nextInt();
			System.out.println("나누기! "+(10/num));
		}catch(ArithmeticException e) {
			System.out.println("0으로 나눌수 없습니다");
		}catch(InputMismatchException e) {
		 System.out.println("정수를 입력하세요!");
		 	}
		 System.out.println("프로그램 종료");
	}
	public void method3() {
		
		System.out.print("배열의 크기 : ");
		int size = sc.nextInt();
		
		try {
			int[] arr = new int[size];
			System.out.println("100번 인덱스 "+arr[100]);
			
//		} catch(RuntimeException e) {
//			//2개의 예외클래스응 1개의 예외클래스로 다루고자할떄? 부모타입예외클래스 사용
//			System.out.println("예외가 발생했습니다");
//			e.printStackTrace();
		
			
		}catch(NegativeArraySizeException e) {
			System.out.println("배열의 크기는 음수를 제시할수 없다");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("부적절한 인덱스입니다");
		} catch(RuntimeException e) {//부모클래스의 예외는 가장 아래에 기술
			//2개의 예외클래스응 1개의 예외클래스로 다루고자할떄? 부모타입예외클래스 사용
			System.out.println("예외가 발생했습니다");
			e.printStackTrace();
		}
	}
	
	/*
	 * RuntimeException꼐열의 예외는 대부분 "조건문으로 해결" 가능
	 * 따라서 에초에 녜외가 발생하지 안ㄹ도록 개발자가 소스코드 핸들링 하는것이 권장한다
	 * 
	 * RuntimeException계열은 충분히 예측가능하기때문에 예외처리가 필수가 아니다(UncheckedException)
	 */

}

















