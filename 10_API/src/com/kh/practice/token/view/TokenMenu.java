package com.kh.practice.token.view;

import java.util.Scanner;

import com.kh.practice.token.controller.TokenController;

public class TokenMenu {
	Scanner sc = new Scanner(System.in);
	TokenController tc = new TokenController();
	
	
	public void mainMenu() {
		while(true) {
		System.out.println("1. 지정 문자열");
		System.out.println("2. 입력 문자열");
		System.out.println("3. 프로그램 끝내기");
		System.out.print("메뉴입력 : ");
		int menu = sc.nextInt();
		sc.nextLine();
		
		switch(menu) {
		case 1:
			tokenMenu();
			break;
		
		case 2:
			inputMenu();
			break;
			
		case 3:
			System.out.println("프로그램을 종료합니다.");
			return;
		default:
			System.out.println("잘못입력하셨습니다 다시 입력해 주세요");
			
		}
		}
		
		
		
	}
	public void tokenMenu() {
		String str = "J a v a P r o g r a m ";
		System.out.println("토큰 처리 전 글자 : "+ str);
		System.out.println("토큰 처리 전 글자의 개수 : "+ str.length());
		
		String result = tc.afterToken(str);
		System.out.println("토큰 처리후 글자" + result);
		System.out.println("토큰 처리 후 글자의 개수 : "+ result.length());
		System.out.println("토큰 처리 후 글자의 개수 : "+ result.toUpperCase());
		
		
		
		
	}
	public void inputMenu() {
		System.out.print("문자열을 입력하세요: ");
		
		String str = sc.nextLine();
		String result = tc.firstCap(str);
		System.out.println("첫글자 대문자 : "+result);
		
		System.out.println("찿을 문자를 하나 입력하세요 : ");
		char ch = sc.nextLine().charAt(0);
		
		int count =  tc.findChar(str,ch);
		System.out.println(ch+"들어간 개수: "+count);
	}

}
