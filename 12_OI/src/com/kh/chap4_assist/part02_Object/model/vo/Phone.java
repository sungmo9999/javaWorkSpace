package com.kh.chap4_assist.part02_Object.model.vo;

import java.io.Serializable;

/*
 * 직렬화(serialization)
 *  - 객체 상태를 그대로 저장하거나 저장된 데이터를 다시 객체로 복원하는 방식을 직력화 ,역직렬화 라고부른다
 *    객체응 byte로 변환 하여 저장하는방식 = 직렬화
 *    byte로 저장된 데이터를 객체로 다시 변환하는 방식= 역직렬화
 *    
 *  - 직렬화를 구현하기 위해선 클래스에 serializable인터페이스를 상속시켜야한다
 *  - serializable 추상메서드는 존재하지 않는다
 */
public class Phone implements Serializable {
	//클래스 고유번호
	private static final long serialVersionUID = 1;
	
	private String name;
	private int price;
	private transient String number;//보안상 중요 데이터.
	//transient 추가시 직렬화 대상필드에서 제외
	public Phone() {
		
	}
	public Phone(String name, int price, String number) {
		this.name = name;
		this.price = price;
		this.number= number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	@Override
	public String toString() {
		return "Phone [name=" + name + ", price=" + price + ", number=" + number + "]";
	}
	
	

}
