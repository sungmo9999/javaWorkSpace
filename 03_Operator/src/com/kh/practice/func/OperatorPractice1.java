package com.kh.practice.func;

import java.util.Scanner;

public class OperatorPractice1 {
	
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("인원수: ");
		int 인원수 = sc.nextInt();
		
		System.out.print("사탕 개수: ");
		int 사탕개수 = sc.nextInt();
		
		int 인당 = (int)(사탕개수 / 인원수);
		int 나머지 =(int)(사탕개수 % 인원수);
		System.out.println("1인당 사탕개수:" + 인당);
		System.out.println("남는 사탕 개수: " + 나머지);
		
		
		
		
		
		
	}

}
