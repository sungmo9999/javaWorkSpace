package com.kh.chap01_innerClass.part02_static.model.dto;

import java.util.Date;

public class kakaoUserInfoResponse {
	
	/*
	 * DTO(Data Transfer Objecct)
	 *  - 값을 전달하기 위해 사용하는 클래스
	 *  - API서버나, DB서버간의 데이터 송수신하기위한 용도의 객테들을 정의하는 클래스
	 *  - vo클래스와 다르게 데이터 송수신이 목적이기 때문에 불필요한 메서드(eqauls, hashcode)들이 존재하지않는다
	 *  - API서버들에는 다양한 기능이 존재하며 기능마다 요구하는 양식, 반환되는 응답데이터의 양식이
	 *    다양하기 때문에 이에 맞춰서 DOP 클래스들응 설계하면 굉장히 많은 양의 클래스가 나온다
	 *  - 너무 많은 DTO클래스가 파일로 존재하면 관리하기가 힘들어 지므로 정적내부 클래스에 필요한 클래스들을
	 *    모아서 관리하는게 일반적이다
	 *  
	 * VO(Value Object)
	 *  - 가치가있는 클래스를 표현하기 위한 목적으로 사용하는 클래스
	 *  - 객체지향적으로 설계된 클래스
	 *  - 어플리케이션의 핵심적인 역할을 하는 클래스를 정의하는 클래스이며, 데이터 "불변성"이 유지되어야 한다.
	 *    따라서 데이터를 중간에 관리하는 setter메서드가 존대하지 않는다.
	 *  - 캡슐화 및 상속이 구현되어 있으며 equals, hashcode등 객체와 기능을 정의하는 메서드들이 들어가있다.
	 */
	private Long id;
	private Date synched_at;
	private KakaoAccount kakao_account;
	
	public static class KakaoAccount{
		private Boolean profile_needds_agreement; 
		private KaKaoProfile profile;
		
	}
	
	public static class KaKaoProfile{
		
	}

}
