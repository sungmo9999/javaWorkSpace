package com.kh.practice.map.view;

import java.util.Scanner;

import com.kh.practice.map.controller.MemberController;
import com.kh.practice.map.model.vo.Member;

public class MemberMenu {
	
	private Scanner sc = new Scanner(System.in);
	private MemberController mc = new MemberController();
	
	public void mainMenu() {
		System.out.println("========== KH 사이트 ==========");
		
		System.out.println("******* 메인 메뉴 *******");
		while(true) {
		System.out.println("1.회원가입");
		System.out.println("2.로그인");
		System.out.println("3.같은 이름 회원 찾기");
		System.out.println("9.종료");
		System.out.print("메뉴 번호 입력 : ");
		int menu = sc.nextInt();
		sc.nextLine();
		
		switch(menu) {
		case 1: joinMembership();
		break;
		
		case 2: login(); memberMenu();
		break;
		
		case 3: sameName();
		break;
		
		case 9:
			System.out.println("종료");
			return;
			default:
			System.out.println("잘못 입력함 다시 입력");
		}
		}
		
	}
	public void memberMenu() {
		System.out.println("******* 회원 메뉴 *******");
		
		while(true) {
		System.out.println("1. 비밀번호 바꾸기");
		System.out.println("2. 이름 바꾸기");
		System.out.println("3. 로그아웃");
		System.out.print("메뉴번호 선택 : ");
		int menu = sc.nextInt();
		sc.nextLine();
		
		switch(menu) {
		case 1: changePassword();
		break;
		
		case 2: changeName();
		break;
		
		case 3: mainMenu();
		return;
		default:
			System.out.println("잘못 입력 다시 입력");
		}
		
		}
	}
	public void joinMembership() {
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		
		System.out.print("비밀번호 : ");
		String password = sc.nextLine();
		
		System.out.print("이름 : " );
		String name = sc.nextLine();	
		
		Member m = new Member(name,password);
		
		mc.joinMembership(id, m);
		
		boolean result = mc.joinMembership(id, m);
		if(!result) {
			System.out.println("중복된 아이디입니다");
		}else {
			System.out.println("회원가입 완료");
		}
		
		
		
		
		
	}
	public void login() {
		System.out.print("아이디 : ");
		String id =  sc.nextLine();
		
		System.out.println("비밀번호 : ");
		String pssword = sc.nextLine();
		
		String name = mc.logIn(id, pssword);
		if(name != null) {
			System.out.println(name+"님 환영합니다.");
			
		}else {
			System.out.println("틀린 아이디 또는 비밀번호입니다.");
			logIn();
		}
		
		
	}
	public void changePassword() {
		
	}
	public void changeName() {
		
		
	}
	public void sameName() {
		
	}
		
	

}
