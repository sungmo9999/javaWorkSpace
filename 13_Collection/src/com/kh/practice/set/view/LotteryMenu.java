package com.kh.practice.set.view;

import java.util.Scanner;

import com.kh.practice.set.controller.LotteryController;

public class LotteryMenu {
	private Scanner sc = new Scanner(System.in);
	private LotteryController lc = new LotteryController();
	
	public void mainMenu() {
		System.out.println("===========추첨 프로그램===========");
		
		 while(true) 
		System.out.println("1. 추첨대상추가");
		System.out.println("2. 추첨 대상 삭제");
		System.out.println("3. 당첨 대상 확인");
		System.out.println("4. 정렬된 당첨 대상 확인");
		System.out.println("5. 당첨 대상 검색");
		System.out.println("9. 종료");
		int menu = sc.nextInt();
		sc.nextLine();
		switch(menu) {
		case 1: insertObject();
		break;
		case 2: deleteObject();
		break;
		case 3: winObject();
		break;
		case 4: sortedWinObject();
		break;
		case 5: searchWinner();
		break;
		case 9:
			return;
			default:
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요");
		
		
		}
		
	}
	public void insertObject() {
		arr[]per = 
		
		System.out.print("추가할 대상 수 : ");
		int per = sc.nextInt();
		
		System.out.print("추첨자 이름 : ");
		String name = sc.nextLine();
		
		System.out.print("추첨자 번호 : ");
		String phone = sc.nextLine();
		
		
		
	}
	public void deleteObject() {
		
	}
	public void winObject() {
		
	}
	public void sortedWinObject() {
		
	}
	public void searchWinner() {
		
	}
}
