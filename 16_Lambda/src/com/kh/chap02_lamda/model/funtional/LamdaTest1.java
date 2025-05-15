package com.kh.chap02_lamda.model.funtional;

//함수형인터페이스로 사용되는 인터페이스
//내부적으로 추상메서드가 딱 하나만 있다
@FunctionalInterface
public interface LamdaTest1 {
	int add(int x, int y);
	//void print(); -> 함수형 인터페이스에 메서드가 2개있을순 없다.

}
