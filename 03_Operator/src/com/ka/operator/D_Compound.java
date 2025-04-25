package com.ka.operator;

public class D_Compound {
	/*
	 * 복합 대입 연산자 : 산술연산자와 대입연산자를 함계 사용하는 연산자
	 *                산술 연산자를 사용하는  것 보다 연산처리 속도가 
	 *                빨라지므로 사용하는걸 권장.
	 *a = a + 3; => a += 3;
	 *a = a - 3; => a -= 3;  			
	 *  
	 *  
	 *  */
	
	public void mathod() {
		int num = 12;
		
		//num의 값을 6배 증가
		num *=6; //num = num * 6;
		
		//num의 값을 2배 감소
		num /= 2;
		
		// num을 4로 나우었을 떄의 나머지를 num에 대입
		num %= 4;
		
		// 문자열도 +=연산자를 사용 할 수있다.
		String str = "Hello";
				
		//String str" world";
		str += "world";
		
	}

}
