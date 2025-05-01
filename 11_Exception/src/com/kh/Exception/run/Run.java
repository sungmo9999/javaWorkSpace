package com.kh.Exception.run;

import com.kh.Exception.controller.A_UncheckedException;

public class Run {
	public static void main(String[] args) {
		//NullPointException,ArrayIndexOutOfBoundsException
		
		/*
		 * 에러의 종류
		 * 1.시스템에러 : 컴퓨터의 오작동으로 발생하는 에러로 소스코드로 해결 불가.
		 * 2. 컴파일 에러 : 문법적인문제로 발생하는에러 소스코드로 수정이가능하다
		 * 3. 런타임 에러 : 프로그램 실행중 발생하는 코드로 소스코드로 수정해결가능
		 * 4. 논리에러 : 컴파일에서도 문제가 없고 런타임에서도 문제가 없는데 프로그램이 실행될 때
		 *    내 의도와 다른방식으로 실행되는경우
		 * 
		 * 컴파일에러 런타임에러 같은 에러들을 처리하는 방법을 예외처리라고 분른다
		 *  - 프로그램의 비정상적인 종료를 막기위해
		 *  - 프로그램이 돌아갈때 예외가 발생하는 상황을 기록하여 이후 유지보수하기 위해 필요.
		 *   
		 *  예뢰처라방법
		 * 1. try ~ catch문 이요하기
		 * 2. throw를 이용 
		 */
		A_UncheckedException a = new A_UncheckedException();
		a.method3();
	}

}
