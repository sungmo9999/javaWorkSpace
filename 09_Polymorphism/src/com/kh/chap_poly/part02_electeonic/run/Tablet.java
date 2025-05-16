package com.kh.chap_poly.part02_electeonic.run;

import com.kh.chap_poly.part02_electeonic.model.vo.Electeonic;

public class Tablet extends Electeonic {
	
	public Tablet() {
		
	}
	public Tablet(String brand, String name, int price) {
		super (brand, name, price);
		
	}
	public String toString() {
		return "Tablet [toString()=" + super.toString() + "]";
	}

}
