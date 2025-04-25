package com.kh.chap02.loop;

public class A_For {
	/*
	 * <반복문.
	 *  - 실행할 코드를 반복적으로 수행시켜줌
	 *  - for문과 while문으로 나뉨
	 *  [표현법]
	 *  for(초기식; 조건식; 증감식);{
	 *      반복으로 실행할 코드;
	 *  }
	 *  
	 *  
	 * - 초기식 : 반복문이 시작될때 "초기에 한번만 실핼" 되는 구문
	 *				반복문에서 사용할 변수를 선언 및 초기화 하는 역할
	 * - 조건식 : "반복이 수행될 조건" 을 작성하는 구문
	 * 			 조건식의 결과가 ture 라면 반복 수핼.
	 * 			 조건식릐 결과가 false라면 반복 종료.
	 * - 증감식 : 반복문을 제어하는 변수 값을 증강시키는 구문(++,--)
	 * 
	 *   for문 실행 흐름
	 *   1.초기식 실핼
	 *   2.조건식 실행
	 *   3-1.조건식의 결과가 참이라면 for문 내부코드 실행
	 *   3-2.조건식의 결과가 거짓이라면 for문 종료
	 *   4.for문 내부코드 실행후, 증감식 실행
	 *   5.다시 조건식부터 실행(2번으로이동)
	 *  */
	
	
	
	public void method1() {
		
		//5회반복문
		for(int i = 0 ; i < 5 ; i++ ) {
		System.out.println("안녕!");
		}
		
		//5회반복
		for(int i =11; i< 16; i++) {
			System.out.println("하이!");
			
		}
		//5회반복
		for(int i = 0; i <10 ; i+=2) 
			System.out.println("하이요");
	    

    }
	
	public void method2() {
		//1 2 3 4 5(공백)
		for(int i = 1; i<= 5; i++) {
			System.out.print(i+" ");
		}
		
		
	}
	public void method3() {
		//1과 0 사이의 정수중 홀수만 출력하는 반복문을 만드시오
		//13579
		for(int i = 1; i <=10; i+=2) {
		System.out.println(i+" ");
		}
		
		for(int i= 1; i<=10; i++) {
			if(i % 2 ==1) {
				System.out.println(i+" ");
			}
			
		}
		
	}
	
	public void method4() {
		//산술련산과 반복문을 사용하여
		//1부터 10까지의 합계
		int sum = 1+2+3+4+5+6+7+8+9+10;
		
		
		int sum2 = 0; //1부터10까지의 값을 저장할 변수
		for(int i = 1; i <=10; i++) {
			sum2 += i;
			
		}
		System.out.println("sum :"+sum);
		System.out.println("sum2:"+sum2);
		
		
		
	}
	public void method5() {
		//1에서부터 매번 달라지는 "랜덤값" 까지의 총 합계
		
		/*
		 *  java.lang.Math클래스에 random() 를 호출하면
		 *  매번 다른 실수형의 램덤값을 얻어올수있다.
		 *  램덤값의 범위 == 0.0 <= 램덤값 <1.0
		 *  
		 *   만약에 1과 10사이의 램덤값을 얻고싶다면?
		 *   
		 *   우선 10을 곱하기
		 *   0.0<= 램덤값 < 10.0
		 *   1 더하기
		 *   1.0 <= 램덤값 <11.0
		 *   소수점 버리기
		 *   1 <= 램덤값 <=10
		 *   
		 *   코드 == 램덤값 * 10 + 1 
		 *   10-> 출력하고자하는 개수
		 *   1->시작수
		 *   
		 *   Math.random() * 출력할 개수 + 시작수
		 *  ==> 시작수! (시작수+개수)
		 *  */
		int random = (int)(Math.random() * 10 +1);
		System.out.println("1 ~ 10 사이에 램덤값 : "+random);
		
		int sum = 0;
		for(int i = 1; i <= random; i++) {
			sum +=i;

		}
		System.out.println("1~램덤값 까지의 합"+sum);
		
		
	}
	public void method6() {
		String str = "hello world";
		
		System.out.println(str.charAt(0));//h
		System.out.println(str.charAt(1));//e
		System.out.println(str.charAt(2));//l
		System.out.println(str.charAt(3));//l
		System.out.println(str.charAt(4));//o
		
		
		System.out.println("-------------------");
		for(int i = 0; i< str.length(); i++) {
			System.out.println(str.charAt(i));
		}
	}
	
	public void method7() {
		// 중첩 반복문.
		
		//구구단 출력
		//구구단 2간 출력
		//2X1=2
		//2X2=4
		//...
		//2X9=18
		for(int i = 1; i<= 9; i++) {
			System.out.printf("2 X %d = %d", i, i*2);
			System.out.println();
		}
		
		//구구단을 2단구터 9단까지 모두 출력
		for(int j =2 ; j <= 9; j++) {
			for(int i = 1; i<= 9; i++) {
				System.out.printf("%d X %d = %d",j, i, i*2);
				System.out.println();
			}
	 	 } 
		 	
		}
		
	public void method8() {
		//*****\n
		//*****\n
		//*****\n
		//*****\n
		for(int j = 0; j< 4; j++) {
			for(int i= 0; i<5; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
	
		
		
	}
	
	public void method9() {
		//1***
		//*2**
		//**3*
		//***4
		for(int i = 1; i <= 4; i++) {
			if(i == 1) {//첫 반복시
				System.out.print(1);
			}else {
				System.out.print("*");
			}
		}
		System.out.println();
		for(int i = 1; i <= 4; i++) {
			if(i ==2 ) {
				System.out.print(2);
			}else {
				System.out.print("*");
			}
		}
		System.out.println();
		
		for(int j = 1; j <= 4; j++) {
			
		

}
		
	}
}
	
	
	
	
	
	
	











