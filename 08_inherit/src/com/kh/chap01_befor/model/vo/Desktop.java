package com.kh.chap01_befor.model.vo;

public class Desktop {
	private String brand;
	private String pCode;
	private String pName;
	private int price;
	private boolean allInOne;

	/*
	 * Tv desktop SmartPhone ....가전제품클래스들을 만들떄 마다.
	 * 각 클래스에 필요한 필드들을 작성시 " 중복으로 들어가는 코드가 많은 경우 유지보수 과정에서
	 * 수정이 필요한 경우 모든 필드들을 일일이 수정하는 번거로움이나 새로운 공통 필드 추가시에
	 * 번거로움 생산성측면에서 안 좋은 영향을 끼친다.
	 *  
	 *  이럴때는 상속이라는 개념을 적용시켜서
	 *  매 클래스마다 중복된필드 및 매서드들을 하나의 클래스에 정의 해둔 후, 해당 클래스를 상속 받는 식으로
	 *  작업하는게 좋다.
	 *  */
}
