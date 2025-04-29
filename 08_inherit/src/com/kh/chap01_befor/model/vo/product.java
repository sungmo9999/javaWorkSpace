package com.kh.chap01_befor.model.vo;

public class product {
	//다양한 제풐클래스에서 공통으로 사용하는 필드, 기능을 정의하해둘 클래스 : 부모클래스
	
//	private String brand;
//	private String pCode;
//	private String pName;
//	private int price;
	
	protected String brand;
	protected String pCode;
	protected String pName;
	protected int price;
	
	
	
	
	public product() {
		
	}
	
	public product(String brand, String pCode, String pName, int price) {
		super();
		this.brand = brand;
		this.pCode = pCode;
		this.pName = pName;
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getpCode() {
		return pCode;
	}

	public void setpCode(String pCode) {
		this.pCode = pCode;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	public String information() {
		return "brand : "+brand+",pCord : "+pCode+", pName : "+pName+
				", price : "+price; 
				
	}
	

}
