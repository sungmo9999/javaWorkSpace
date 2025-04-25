package com.kh.chap02_encapsulation.run;

import com.kh.chap02_encapsulation.model.vo.Student;

public class Run {
	/*
	 * 캡슐화
	 * 
	 * -객체내부의 데이터를 반드시 확인/ 아용 해야하는 상황이 있을수
	 * 	있으므로 간접적으로 내부 데이터를 처리할 수있는 메서드를 추가로
	 *  작성한다
	 *  
	 *  1) 정보은닉: vrivate
	 *  	필드들을 외부로부터 직접 접근하지 못하도록 할떄.
	 *  2) setter / getter
	 *  	간접적으로 객체의 필드에 값을 주거나, 가져올 수 있는 메소드들
	 *  */
		
	public static void main(String[] args) {
		Student nam = new Student();
		nam.setName("남건후");
		nam.setAge(15);
		nam.setHeight(180.5);

		System.out.println(nam.getName());
		nam.getAge();
		
		System.out.println(nam.information());
	}
  
}
