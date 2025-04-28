package com.kh.chap03_field.model.vo;

public class FieldTest3 {
	
	public static String sta = "static 변수";
	/*
	 * static : 정적인, 고정된
	 * static키워드는 특정변수나 메서드들을 static메모리 영역에 고정시켜준다
	 * 따라서 , 자주사용하는 변수, 메서드를 static으로 관리하여 메모리 영역에 고정시켜두고
	 * 사용하면 효율이 좋고 가끔 사용하는 변수를 static영역에 보관하게되면 효율이 좋지 않다
	 *  */
	
	/*
	 * 상수필드
	 * public static final 자료형 변수명 = 값;
	 * 한번 저장된 값을 고정해서 쓰기 때문에 무조건 초기화를 해줘야 하며, static변수는 보통
	 * 값이 변경되어서는 안되기 때문에 final과 함께 사용한다
	 *  */
	public static final double PI = 3.14;
	
	public static void test() {
		System.out.println("하이");
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
}
