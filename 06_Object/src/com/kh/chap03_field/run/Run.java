package com.kh.chap03_field.run;

import com.kh.chap03_field.model.vo.FieldTest1;
import com.kh.chap03_field.model.vo.FieldTest3;

public class Run {
	public static void main(String[] args) {
		FieldTest1 ft1 = new FieldTest1();
		//ft1.test(0); 
		
		FieldTest3 ft3 = new FieldTest3();
		System.out.println(ft3.sta);// 객체 생성하 필요가 없음
		System.out.println(ft3.PI);
		
		//static 변수 사용
		//클래스면.변수명
		System.out.println(FieldTest3.sta);
		System.out.println(FieldTest3.PI);
		// 클래스명.메서드명();
		FieldTest3.test();
	
		
	}

}
