package com.kh.practice.chap02.loop.LoopPractice;

import java.util.Scanner;

public class LoopPractice {

	Scanner sc = new Scanner(System.in);

	
	public void practice1() {
		
		while(true) {
			System.out.print("1이상의 숫자를 입력하세요: ");
			int num = sc.nextInt();
		

		for (int i = 1; i <= num; i++) {
			System.out.print(i + " ");
		}
		if(num < 0 )
			break;
		
		System.out.println("1이상의 숫자를 입력해 주세요");
		}
	}
	
	
	
	public void practice2() {

		while (true) {
			System.out.print("1 이상의 숫자를 입력 하세요 : ");
			int num = sc.nextInt();

			for (int i = 1; i <= num; i++) {
				System.out.print(i + " ");
			}
			if (num > 0)
				break;
			System.out.println("1이상의 숫자를 입력해 주세요");
		}
	}

	public void practice3() {
		
		while(true) {
			System.out.print("1이상의 숫자를 입력하세요: ");
			int num = sc.nextInt();
			
			for(int i = num; i > 0; i--) {
				System.out.print(i+" ");
			}
			if (num >0)
				break;
			System.out.println("1이상의 숫자를 입력해 주세요");
		}
	}
	
	public void practice4( ) {
		
		
		
		
	}
	public void practice5() {
		
		System.out.print("정수 입력 : " );
		int num = sc.nextInt();
		
		int sum=0;
		for(int i = 1; i<=num; i++) {
			sum += i;
			System.out.print(i +(i == num ? " = ":" + "));
		}
		System.out.print(sum);
		
		
	}
	public void practice6() {
		
		System.out.print("첫 번쨰 숫자 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번쨰 숫자 : ");
		int num2 = sc.nextInt();
		
		if(num1 <1 || num2 < 1) {
			System.out.println();
			return;
		}
		
		int min = num1 > num2 ? num2 : num1;
		int max = num1 > num2 ? num1 : num2;
		
		for(int i = min; i<= max; i++){
			System.out.print(i+" ");
			
		}
	}
	
	 public void practice7() {
		 System.out.print("첫 번쨰 숫자 : ");
			int num1 = sc.nextInt();
			
			System.out.print("두 번쨰 숫자 : ");
			int num2 = sc.nextInt();
			
			if(num1 <1 || num2 < 1) {
				System.out.println();
				practice7();
				return;
			}
			
			int min = num1 > num2 ? num2 : num1;
			int max = num1 > num2 ? num1 : num2;
			
			for(int i = min; i<= max; i++){
				System.out.print(i+" ");
				
			}
		 
		 
		 
	 }
	 public void practice8() {
		 System.out.print("숫자 : ");
		 int dam = sc.nextInt();
		 
		 System.out.println("======"+dam+"단=====");
		 
		 for(int i =1; i<=9;i++) {
			 System.out.printf("%d*%d=%d\n",dam, i,dam);
		 }
		 
		 
	 }
	 public void practice11() {
		 System.out.print("시작숫자 : ");
		 int num = sc.nextInt();
		 
		 System.out.print("공차 : ");
		 int gong = sc.nextInt();
		 
		 for(int i= 0; i< 10; i++){
			 System.out.print(num + gong *i);
		 }
		 
		 int count = 0;
		 for(int i = num; count< 10; num +=gong) {
			 System.out.print(i+" ");
			 count++;
		 }
	 }
	 
		 public void practice12() {
			 while(true) {
			 System.out.print("연산자 입력(+ - * / %) : ");
			 String str = sc.nextLine();
			 
			 if(str.equals("exit")) {
				 System.out.println("프로그램 종료");
				 return;
			   }
			 
			 
			 char ch = str.charAt(0);
			 
			 if(!(ch == '/' || ch == '%' || ch =='*' ||ch == '+'|| ch == '-'));
				 
			 
			 System.out.print("정수 1 : ");
			 int num1 = sc.nextInt();
			 
			 System.out.print("정수 2 : ");
			 int num2 = sc.nextInt();	
			 
			 
			 
			 }
			 
			 
		 
		 
	 }
		 
	 public void practice13() {
		 System.out.print("정수: ");
		 int num = sc.nextInt();
		 
		 for(int i= 0; i<1; i++) {
			 System.out.print("*");
		 }
		 System.out.println();
		 
		 
		 for(int i= 0; i<2; i++) {
			 System.out.print("*");
		 }
		 System.out.println();
		 
		 
		 for(int i= 0; i<3; i++) {
			 System.out.print("*");
		 }
		 System.out.println();
		 
		 for(int i= 0; i<4; i++) {
			 System.out.print("*");
		 }
		 System.out.println();
			 
		 }
	 
	 
	 public void practice14() {
		 
		 System.out.print("정수: ");
		 
		 for(int j = 4; j>0 ; j--) {
		 int num = sc.nextInt();
		 for(int i =0; i<4; i++) {
			 System.out.print("*");
			 
		 }
		 System.out.println();
		 
	 }
	 
		 
	
	

}
}












