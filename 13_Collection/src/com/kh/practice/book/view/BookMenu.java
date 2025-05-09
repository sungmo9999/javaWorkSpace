package com.kh.practice.book.view;

import java.util.GregorianCalendar;
import java.util.Scanner;

import com.kh.practice.book.controller.BookController;
import com.kh.practice.book.model.vo.Book;

public class BookMenu {
	private Scanner sc = new Scanner(System.in);
	private BookController bc = new BookController();
	private Book bArr[];
	
	public BookMenu() {
		bc.makeFile();
		bArr = bc.fileRead();
	}
	public void mainMenu() {
		while(true) {
			System.out.println("1. 도서 추가 저장");
			System.out.println("2. 저장 도서 출력");
			System.out.println("9. 프로그램 끝내기");
			System.out.println("메뉴번호");
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
		String title = sc.nextLine();
		
		System.out.print("저자 명 : ");
		String author = sc.nextLine();
		
		System.out.print("도서가격 : ");
		int price  = sc.nextInt();
		
		System.out.print("날짜 : ");
		int date  = sc.nextInt();
		
		System.out.print("할인율 : ");
		
		String[]arr =  date.split("-");
		Calender c = new GregorianCalendar(
				Intger.parseInt(arr[0])
				Intger.parseInt(arr[1])
				Intger.parseInt(arr[2]));
		
		
	}
	public void fileRead() {
		Book[] arr = bc.fileRead();
		for(Book b: arr) {
			if(b != null)
				System.out.println();
				
		}
			
		
	}
	

}
