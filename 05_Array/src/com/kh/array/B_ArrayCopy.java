package com.kh.array;

import java.util.Arrays;

public class B_ArrayCopy {
	/*
	 *  배열복사
	 *  - 얕은복사 : 주소값만 복사
	 *  - 깊은복사 : "새로운 배열"을 생성하여 실제 내부값들도 복사
	 *  */

	public void method1() {
		
		int [] origin = {1,2,3,4,5};
		
		System.out.println("== 원본 배열 출력 ==");
		System.out.println(Arrays.toString(origin));
		
		//copy본 매열 생성
		//얕은 복사
		int []copy = origin;
		
		System.out.println("== 복사본 배열 출력 ==");
		System.out.println(Arrays.toString(origin));
		
		copy[2] = 99;
		
		System.out.println("== 복사본 배열 수정후 ==");
		
		System.out.println("== 원본 배열 출력 ==");
		System.out.println(Arrays.toString(origin));
		
		System.out.println("== 복사본 배열 출력 ==");
		System.out.println(Arrays.toString(origin));
		
		
		
	}
	
	public void method2() {
		//1. for문을 활용한 깊은 복사
		int [] origin = {1,2,3,4,5};
		
		int [] copy = new int[origin.length];
		
		for(int i =0; i< copy.length; i++) {
			copy[i] = origin[i];
		}
		
		copy[2] = 99;
		
		System.out.println("== 복사본 배열 수정후 ==");
	
		System.out.println("== 원본 배열 출력 ==");
		System.out.println(Arrays.toString(origin));
	
		System.out.println("== 복사본 배열 출력 ==");
		System.out.println(Arrays.toString(copy));
		
		
		
	}
	
	public void method3() {
		//System.arraycopy(원본 배열,  원본 베열에서 복사를 시작할 인덱스,
		//복사본 배열, 복사본 베열에서 복사될 시작 인덱스, 복사할 갯수)
		int [] origin = {1,2,3,4,5,0,0,0,0,0,};
		int [] copy = new int[10];
		
		
		//System.arraycopy(origin, 0, copy,0,5);//1 2 3 4 5 0 0 0 0 0
		
		//0 3 4 5 0 0 0 0 0
		
		//System.arraycopy(origin, 2, copy, 1, 3);
		System.arraycopy(origin, 0, origin, 1, 5);
		origin[0] =0;
		
		
		System.out.println(Arrays.toString(origin));//[0,1,2,3,4,5,0,0,0,0,]
		System.out.println(Arrays.toString(copy));//[0,0,0,0,0,0,0,0,0]
		
		
	}
	
	public void method4() {
		//Arrays.copyOf(원본배열, 복사할 개수) 복사본 배열 반환
		int []origin = {1,2,3,4,5};
		
		int [] copy = Arrays.copyOf(origin, 10);
		
		System.out.println(Arrays.toString(copy));
	}
	
	public void method5() {
		//clone 메서드
		int [] origin = {1,2,3,4,5};
		
		int [] copy = origin.clone();
		
		System.out.println(origin == copy);
		System.out.println(Arrays.toString(copy));
		
	}
	
	
}










