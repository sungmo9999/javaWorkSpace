package com.kh.chap_poly.part02_electeonic.run;

import com.kh.chap_poly.part02_electeonic.model.vo.Electeonic;

public class Desktop extends Electeonic {
	
	public static final String CPU= "intel";
	private String graphic;
	
	public Desktop() {
		
	}
	public Desktop(String brand, String name, int price, String graphic) {
		super(brand, name, price);
		this.graphic = graphic;
	}
	public String getGraphic() {
		return graphic;
	}
	public void setGraphic(String graphic) {
		this.graphic = graphic;
	}
	

}
