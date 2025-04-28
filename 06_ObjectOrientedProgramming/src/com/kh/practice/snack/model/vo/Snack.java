package com.kh.practice.snack.model.vo;

import javax.swing.text.InternationalFormatter;

public class Snack {
	
	private String kind;
	private String name;
	private String flavor;
	private int numOf;
	private int price;


	public Snack(){
	
    }

	public Snack(String kind, String name, String flavor, 
		int numOf, int price) {
	
		this.kind = kind;
		this.name = name;
		this.flavor = flavor;
		this.numOf = numOf;
		this.price = price;
	
	}
	public String information() {
		
		return kind+"("+name+" - " +"flaver    +")"+numOf+"개"+price+"원
		
	}
	public void setKind(String name) {
		this.kind = kind;
	}
	public String getKind() {
		return this.kind;
	}
	//나머지들도 만들기

	
}













