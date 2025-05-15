package com.kh.practice.snack.controller;

import com.kh.practice.snack.model.vo.Snack;

public class SnackController {
	private Snack s = new Snack();
	
	public SnackController() {
		
	}
	public String saveDate(String kind, String name, String flavor,
			int numOf, int price) {
	s = new Snack(kind,name,flavor, numOf, price);
	
	return"저장 완료 되었습니다";
	
	}
	
		
	public String confirmData(){
		//s.getKind()+"("+s.getName()+s.getFlavor()+")"+s.getNumOf()+s.getPrice();
		return s.information();
		}
	}



