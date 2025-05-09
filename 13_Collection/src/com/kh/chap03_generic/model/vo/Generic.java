package com.kh.chap03_generic.model.vo;

//현재 클래스에서 사용할 타입변수를 <타입변수>
public class Generic <T , G> {
	 /*
	  * 제네릭 설정방법
	  *  - 여러 참조자료형으로 대체될 수있는 부분을 하나의 문자로 표현한다
	  *    T G V....
	  *  - <> : 다이아몬드 연산자는 참조자료형을 얻어 올 수 있는 연산자
	  *  - 제네릭은 class, method에 각각 지정할 수있다.  
	  */
	T t;
	G g;
	
	public T get() {
		return t;
	}
	
	public void setT(T t) {
		this.t = t;
	}

	public G getG() {
		return g;
	}

	public void setG(G g) {
		this.g = g;
	}

	public T getT() {
		return t;
	}
	public T test(G g) {
		return t;
	}
	//메서드레벨 제네릭 지정
	public<V> void printTest(V item) {
		System.out.println(item);
		
	}
	
	
	

}
