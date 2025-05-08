package com.kh.practice.book.view;

import java.util.Scanner;

import com.kh.practice.book.controller.BookController;
import com.kh.practice.book.model.vo.Book;

public class BookMenu {
	private Scanner sc = new Scanner(System.in);
	private BookController bc = new BookController();
	private Book bArr[];
	
	public BookMenu() {
		
	}
	public void mainMenu() {
		while(true) {
			System.out.println("1. 도서 추가 저장");
			System.out.println("2. 저장 도서 출력");
			System.out.println("9. 프로그램 끝내기");
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
			case 1:
				fileSave();
				break;
			case 2:
				fileRead();
				break;
			case 3:
				System.out.println("프로그램 종료");
				return;
				default:
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
		
	}
	public void fileSave() {
		System.out.print("도서 명 : ");
		sc.nextLine();
		
		System.out.println("저자 명 : ");
		sc.nextLine();
		
		System.out.println("출판 날짜");
		
	}
	public void fileRead() {
		
	}
	

}
