package com.kh.chap03.branch;

public class B_Continue {
	/*
	 * continue : 프로그램 실행중 continue문을 만나면 그 뒤에
	 * 코드들은 실행되지않고 가장 가까운 반복문으로 들어간다
	 *  */
	public void method1() {
		
		for(int i = 1; i<=10; i++) {
			if(i % 2==0) {
				continue;
			}
			System.out.print(i+" ");
		}
		
	}
	public void method2() {
		//1부터 100까지의 총 합계를 구함.
		//단, 6의 배수값은 빼고 더하기
		
		int sum= 0;
		for(int i = 1; i <= 100; i++){
			if(i % 6 == 0) continue;
			sum +=1;
		}
		System.out.println("총 합계 : " + sum);
	}

}
