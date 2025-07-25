package com.kh.chap01_constant.run;

import java.util.Calendar;

import com.kh.chap01_constant.model.vo.Car;
import com.kh.chap01_constant.model.vo.CarColor;
import com.kh.chap01_constant.model.vo.Color;

public class Run {
	public static void main(String[] args) {
		
		/*
		 * 상수
		 * - 값이 변하지 않는 변수
		 * - 저장하고 있는 갑셍 대해서 가독성과 전달력을 높이기 위래 사용
		 * - static final키워드를 사용하여 static영역에 데이터를 저장하고 재사용한다
		 * - 일반적으로 상수 값은 변수명을 통해 의미를 부여하고실제 값은 정수값을 저장하는경우가 많다 
		 */
		
		Car car1 = new Car();
		
		car1.setCarColor(0);
		car1.setCarColor(Car.BLACK);
		car1.setCarColor(CarColor.BLACK);
		
		//상수의단점 값에대한 검증기능이 없다.
		car1.setCarColor(Calendar.YEAR); //이상한 인터페이스의 상수 사용
		
		//그외 단점
		// - 비슷한 상수 값을 하나의 변수로 관리할 수 없음
		// EX) 다양한 어플리케이션에서 사용되는 상수 값이 있을때 이를 하나의 변수로 관리하고싶은경우
		// JAVA에서는 boolean 으로 관리하는 값을 Oralce과 같은 서버에선 true 라는 문자열로
		//관리 될때 true, "true"는 한 묶음으로 관리되 어야한다
		// - 상수마다 고유 메서드를 사용할 수 없다
		
		//상수의 단점을 보완한 코딩방식
		// - 값자체에 의미부여, 검증가능, 고유메서드, 비슷한값들을 하나로 모아서 관리
		// - 상수를"객체"단위로 관리
		Car car2 = new Car();
		car2.setCarColor(Calendar.YEAR);//검증가능 x
		//car2.setColor(Calender.YEAR);//검증가능
		car2.setColor(Color.BLACK);
		
	}
	
	
	
	
	

}
