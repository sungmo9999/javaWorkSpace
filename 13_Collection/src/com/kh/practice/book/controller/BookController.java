package com.kh.practice.book.controller;

import java.io.File;
import java.io.IOException;

import com.kh.practice.book.model.dao.BookDAO;
import com.kh.practice.book.model.vo.Book;

public class BookController {
	private BookDAO bd = new BookDAO();
		
	public void makeFile() {
		File file = new File("book.txt");
		if(file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				
			}
		}
		
	
	public void fileSave(Book[]bArr) {
		
	}
	public Book[]fileRead(){
		return bd.fileRead();
		
	}
}

