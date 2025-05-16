package com.kh.chap_poly.part02_electeonic.controller;

import com.kh.chap_poly.part02_electeonic.model.vo.Electeonic;
import com.kh.chap_poly.part02_electeonic.run.Desktop;
import com.kh.chap_poly.part02_electeonic.run.NoteBook;
import com.kh.chap_poly.part02_electeonic.run.Tablet;

public class ElectronicController {
	
	private Desktop desk;
	private NoteBook note;
	private Tablet tab;
	public Electeonic[] elec = new Electeonic[3]; 
	
	//제품입고 메서드
	//다양성 적용전
	public void insert(Desktop d) {
		desk = d;
		
	}
	public void insert(NoteBook n) {
		note = n;
	}
	public void insert(Tablet t) {
		tab = t;
	}
	//제품 조회 매서드
	public Desktop selectDesktop() {
		return desk;
	}
	public NoteBook selectNotBook() {
		return note;
	}
	public Tablet selectTablet() {
		return tab;
	}
	public void insert(Electeonic e , int index) {
		elec[index] = e;
	}
	public Electeonic select(int index) {
		return elec[index];
	}

}
