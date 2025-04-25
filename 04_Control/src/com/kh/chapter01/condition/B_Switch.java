 package com.kh.chapter01.condition;

import java.util.Scanner;

public class B_Switch {
	/*
	 * sithch문
	 *  - if문과 동일한 조건문
	 *  - if문은 조건식을 복잡하게 기술할 수 있음 값의 범위응제시
	 *  하지만, switch는 확실한 하나의 값만 기술(동등비교만 수행가능)
	 *  표현번
	 *  switch(동등비교할 조건식, 변수){
	 *  case값1 : 실행할 코드; //switch문의 변수와 값1이 동등한경우
     *   				   //실행하는코드
     *   		//break; //코드실행후 switch문을 탈출하는역할을함
     *  		 //break가 없다면 아래쪽코드 순차적으로 실행
	 *  case 값2:
	 *             
	 *  case 값n:
	 *  
	 *  default : 위의 값들중 일차하는값이 없는 경우 실행할 코드를 기술
	 *  		  //break
	 *  }
	 *  
	 *  switch의 장점 ->case를 통해 내가 실행하기를 원하는 코드로 
	 *  즉시 이동하기 떄문에 연산속도가 if~ else if문 보다 빠르다.
	 *
	 *  switch문 의 사용처
	 *   - 항상 동일한 속도로 연산이 수행되어야 하는경우
	 *   ex)키보드 입력 마우스 입력
	 *   - 가독성측면에서 if~ else if문보다 더 뛰어난 경우
	 *   ex) 동등하고 조건식을 5회 이상 사용하는경우 switch문 사용 권장 
	 *  */
	Scanner sc = new Scanner(System.in);
	
	
	public void method1() {
		
		System.out.print("1 ~ 3 사이의 정수 입력 : ");
		int num = sc.nextInt();
		
		if(num == 1) System.out.println("빨간불");
		else if(num == 2) System.out.println("파란불");
		else if(num == 3) System.out.println("초록불");
		else System.out.println("잘못 입력 했습니다");
		
		switch(num) {
		case 1 : System.out.println("빨간불");
					break;
		case 2 : System.out.println("파란불");
					break;
		case 3 : System.out.println("초록불");
					break;
		default : System.out.println("잘못 입력 했습니다");
		}
	}
		public void method2() {
			
			System.out.println("KH과일가게");
			System.out.print("구매할 과일(사과,망고,바나나):");
			String fruit = sc.nextLine();
			
			int price = 0;
			
			switch(fruit) {
				case "사과" :
			price = 1000;
				break;
				case"망고" :case "바나나" :
			price = 3000;
				break;
				default :
				System.out.println("저희 가게에서 판매하는 과일이아님");
				return; //메서드 종료
			}
			
			System.out.printf("%s의 가격은 %d원 입니다.", fruit, price);
	}
}
