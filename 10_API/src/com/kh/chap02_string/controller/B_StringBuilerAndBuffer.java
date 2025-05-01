package com.kh.chap02_string.controller;

public class B_StringBuilerAndBuffer {
	/*
	 * StringBilder And Buffer
	 * - 문자열 기반 클래스
	 * - 문자열의 메모리부족 이슈를 해결하기 위해 만들어진 클래스
	 * - 두 클래스는 동일한 메서드를 가지고 있다
	 * - 차이점은 동기화 여부 하나
	 * - Stringbilder는 동기화를 지원 하지 않기 때문에 멀티스레드 환경에서도 좋은 성능을 보인다
	 * - StringBuffer는 동기화를 지원하기떄문에 멀티스레드 환경에서 스레드 안전성을 보장할수있다.
	 *    성능리 좋지 못하다	
	 *  
	 *  
	 *  */
	
	public void method() {
		String str = "hello";
		str += "world";//주소값 2개 사용
		
		StringBuilder sb1 = new StringBuilder();
		sb1.append("hello"); //hello
		sb1.append("world"); //helloworld//주소값1개사용
		
		StringBuffer sb2 = new StringBuffer("hello");
		sb2.append("world!!!");//helloworld
		
		//StringBilder 메서드
		//index위치의 문자응 제거
		sb2.deleteCharAt(sb2.length()-1);
		
		//w문자를 제거하고싶다면 인덱스 위치를 알아야함
		sb2.deleteCharAt(sb2.indexOf("w"));//처음나오는 w
		
		//특정 범위의 데이터를 삭제하는 방법
		//delete(시작인덱스,종료인덱스)
		sb2.delete(sb2.indexOf("w"), sb2.length()-1);
		
		//System.out.println(sb2);
		
		
		
	}

}









