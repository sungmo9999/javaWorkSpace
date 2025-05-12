package com.kh.chap03_generic.run;

import java.util.ArrayList;
import java.util.List;

import com.kh.chap03_generic.model.vo.Child1;
import com.kh.chap03_generic.model.vo.Child2;
import com.kh.chap03_generic.model.vo.Generic;
import com.kh.chap03_generic.model.vo.Generic2;
import com.kh.chap03_generic.model.vo.Parent;

public class Run {
	public static void main(String[] args) {
		//1.제네릭 등장이전
		// - 컬렉션에 데이터를 추가 할때 항상Object객체로 저장
		// - 저장된 데이터를 꺼내서 사용시 "반드시형변환"이필요
		// - 단, 형변환시 잘못된 자료형으로 형변환 하거나, 담겨있는데이터가 형변환 하고자하는 타입이 
		//   아닐경우 에러가 발생할 수있다
		
		List l = new ArrayList();
		for(Object o :l) {
			System.out.println((String)o);//o에 담ㄹ긴 데이터가 문자열이 아닐 수 있다.
		}
		
		/*
		 * 2. 제네릭(JDK1.5 버전에서 등장)
		 *  - 데이터의 자료형을 일반화시켜서 여러 자료형을 다룰 수 있게 만든 문법
		 *  - 클래스의 메서드의 반환형, 매개변수, 필드의 자료들을 미리 지정하지 않고 파아미타화하여
		 *    나중에 사용할 수 잇게 만드는 방법
		 *  
		 *  - 제네릭을 사용하면 다양한 타입(자료형)을 저장할 수 있기 떄문에 타입변수라고 불린다.
		 *  - 제네릭을 사용하면 런타임 시점이 아닌 컴파일 시점에서 에러를 캐치 할 수있으므로 타입
		 *    안정성을 확보할 수 있다.
		 */
		
		Generic<Integer, String> g1 = new Generic<>();
		g1.setT(11111); //컴파일 시점에서T는 Integer 로 확정
		g1.setG("Strin");
		g1.printTest("String");
		g1.printTest(12345);
		g1.<String>printTest("111");
		
		Generic<String, Integer> g2 = new Generic<>();
		g2.setG(1111);///g2에서 T는 String 자료형
		
		//대입될 데이터와 타입을 미리 정해두지 않고, 컴파일 시점에서 정해주므로 재사용성이 크게 증가한다.
		
		//3. 제네릭에의 extends
		// - 제네릭에서 extends는 클래스간의 상속개념이 아닌 제네릭으로 지정한 자료형을 제한
		// 시키는데 사용한다
		// - <T extends Parent>:타입변수Parent클래스 및 Parent클래스를 상속받은 
		//                     자료형만 제시할수 있다.
		// - <T extends Interface>: Interface를 구현한 클래스만 타입변수에 제시다능
		
		Generic2<Parent> parent = new Generic2<>();
		Generic2<Child1> Child1 = new Generic2<>();
		
		parent.setT(new Parent());
		parent.printing();
		
		
		/*
		 * 4. 와일드카드
		 *  - Generic에 들어가야할 자료형을 모르는 경우
		 *  - 와일드카드(?)의 의미는 어떤 자료형이 들어올지 모른다(unknown)의 의미로 사용 ?가
		 *  어떤 자료형이든 올 수 있다는 any의 의미가 아니다
		 *  - ?dpsms super와 extend를 사용하여 와일드 카드의 범위를 제한 할 수있다.
		 *  - ? extends T : 상한제한 => 와일드카드 범위를 T또는 T의 자식들로 제한
		 *   ? spuer T: 하한선 제한 => 와일드카드의 범위를 T또는 ㅆ의 조상들로 제한
		 */
		Generic2<?> unknown = new Generic2<>();
		//unknown.setT(new Parent());
		//?는 자료형의 범위가 정해져있지않은 상태
		//?오 타입변수 사용시 올바른 갇ㅅ이 들어갔는지 검사가 불가능 하므로 에러를 발생
		//?의 제대로된 사용을 위해서 extends와 super를 사용하여?의 범위를 정해줘야한다
		
		
		// 1) extends 를 통한 와일드카드 범위 제한
		Generic2<? extends Parent> nuknown2 = new Generic2<>();
		// ?의 범위 : Parent, Parent의 자식들
		
		//unknown2.setT(new Parent()); //?범위에 Parent의 자식클래스도 포함 되어있으므로 "대입불가"
		//unknown2.setT(new Child1()); //?범위의 Child2도 포함되어있으므로, "대입불가"
		
		Parent p =  nuknown2.getT();// ?가 Parent이든, 그 자식이든 다형성에 의해 값을추출하여 대입가능
		// extends를 통한 타입 제한은 데이터 "가져올떄" 사용한다
		
		//2) super를 통한 와일드카드 범위 제한 : 
		//  ?super Parent : 와일드카드의 범위는 Parent, Parent의 조상클래ㅐ스
		Generic2<? super Parent> unknown3 = new Generic2<>();
		//?의 범위 :Parent와 Object
		
		unknown3.setT(new Parent()); //다형성의 업캐스팅 발생
//		Object o = new Parent();
//		Parent p2 = new Parent();
		unknown3.setT(new Child1());
		unknown3.setT(new Child2());// 최소 자료형이 Parent이기 때문에 대입에 문제 없음
		// 값을 대입할ㄹ 때는 super를 쓰는게 적절하다
		
		//Parent p3 = unknown3.getT(); //?는 Object 일수도있음
		
		Parent p4 = new Parent();
		//Parent p5 = new Object();//상속관계이긴하나 저장시 다운캐스팅필요하므오 컴파일 에러가 발생
		
		
	}
	

}






