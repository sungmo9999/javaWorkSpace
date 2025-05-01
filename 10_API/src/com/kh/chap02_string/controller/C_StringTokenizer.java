package com.kh.chap02_string.controller;

import java.util.StringTokenizer;

public class C_StringTokenizer {
	
	//StringTokenizer : 문자열을 구분자를 기준으러 토큰단위로 분리시키는 클래스
	public void method() {
		
		String str = "Java,Oracle,JDBC,HTLM,Sever";
		
		//구분자를 통해 문자열을 분리시키는 방법
		//1.String의 split()메서드를 이용하는 방법
		//  문자열.Split(구분자) : String[]
		//  너무큰 문자열을 구분 할 경우 메모리 부족에러가 발생할 수있다.
		String[]arr = str.split(","); //["Java","orcle"......]
		
		for(String s: arr) {
			System.out.println(s);
			
		}
		System.out.println("========================================");
		//2. StringTokenizer 클래스를 이용하는 방법
		//   StringTokenizer stn = new StringTokenizer(문자열 구분자)
		StringTokenizer stn = new StringTokenizer(str, ",");
		
		System.out.println("분리된 문자의 갯수 : " +stn.countTokens());
		
		
		//stn.countTokens()현재 남은 토큰의 갯수를 반환하기떄문에 일반 반복문에서 사용불가
//		for(int i = 0; i<stn.countTokens();i++) {
//			System.out.println("현재 토큰의 문자열 : "+stn.nextToken());
//		}
		//stn.hasMoreTokens() =>토큰갯수가 0보다 큰지 확인하는함수
		while(/* stn.countTokens()>0 */ stn.hasMoreTokens()) {
		System.out.println("현재토큰의문자열 : "+stn.nextToken());
		
		//재사용불가
		//System.out.println("현재 토큰의 문자열: " +stn.nextToken());
		
		}
		
	}

}
