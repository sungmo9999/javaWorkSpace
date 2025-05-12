package com.kh.practice.set.view;

import java.util.Scanner;

import com.kh.practice.set.controller.LotteryController;
import com.kh.practice.set.model.vo.Lottery;

public class LotteryMenu {
	private Scanner sc = new Scanner(System.in);
	private LotteryController lc = new LotteryController();
	
	public void mainMenu() {
		System.out.println("===========추첨 프로그램===========");
		
		 while(true) {
		System.out.println("1. 추첨대상추가");
		System.out.println("2. 추첨 대상 삭제");
		System.out.println("3. 당첨 대상 확인");
		System.out.println("4. 정렬된 당첨 대상 확인");
		System.out.println("5. 당첨 대상 검색");
		System.out.println("9. 종료");
		System.out.print("선택 : ");
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
	}
	public void insertObject() {
		
		System.out.print("추가할 대상 수 : ");
		int num = sc.nextInt();
		
		for(int i = 0; i< num;i++) {
		
		System.out.print("추첨자 이름 : ");
		String name = sc.nextLine();
		
		System.out.print("추첨자 번호 : ");
		String phone = sc.nextLine();
		
		Lottery l = new Lottery(name, phone);
		
		boolean result = lc.insertObject(l);
		
		if(!result) {
			System.out.println("중복 다시입력");
			i--;
			}
		}	
		System.out.println("추가완료");
	}
	public void deleteObject() {
		System.out.print("삭제이름");
		String name = sc.nextLine();
		
		System.out.print("삭제 번호 : ");
		String phone = sc.nextLine();
		
		Lottery l = new Lottery(name, phone);
		boolean result = lc.deleteObject(l);
		
		if(lc.deleteObject(l)) {
			System.out.println("삭제 완료");
		}else {
			System.out.println("존재하지 않는대상");
		}
		
		
	}
	public void winObject() {
		System.out.println();
		
	}
	public void sortedWinObject() {
		
		
	}
	public void searchWinner() {
		System.out.print("검색이름 : ");
		String name = sc.nextLine();
		
		System.out.print("검색 폰 : ");
		String phone = sc.nextLine();
		
		Lottery l = new Lottery(name, phone);
		boolean result = lc.searchWinner(l);
		if(result) {
			
		}
	}
}
