package com.kh.chap01_list.arrayList.run;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import com.kh.chap01_list.arrayList.model.vo.Music;
import com.kh.chap01_list.arrayList.model.vo.MusicArtistDeScending;

public class Run {
	/*
	 * 컬렉션(Collection)
	 *  - 자료구조가 내장되어있는 클래스로 자바에서 제공하는 "자료구조"담당 프레임워크
	 *  
	 * 자료구조
	 *  - 데이터들을 효율적으로 다루기워해 필요한 개념
	 *  
	 * 프레임워크
	 *  - 효율적인 기능들이 정의 되어있는 툴
	 * 
	 * 배열과 컬렉션의(List)의 차이점
	 * 
	 * 배열의 특징
	 * 1. 동일한 자료형의 데이터를 관리
	 * 2. 한번 선언한후 크기가 고정
	 * 3. 데이터 저장 외 기능이 존재하지 않는다.
	 * 
	 * 컬렉션의 특징
	 * 1. 여러타입의 데이터를 동신에 보관 할 수 있다.
	 * 2. 크기에 제약이 없다.
	 * 3. 다양한 기능들이 정의되어 있다.
	 * 
	 * 컬렉션의 3가지 분류
	 * 
	 * 1. List계열
	 *    - 담고자 하는 값만을 관리하는 클래스
	 *    - 값을 저장할 때 인덱스를 활용하여 저장순서를 유지
	 *    - 중복된 갓이 들어와도 문제없다.
	 *    - 대표클래스: ArraryList, Vector, LinkedList 등이 존재.
	 * 2. Set계열
	 *    - 담고자하는 값만을 관리하는 클래스
	 *    - 값을 저장할 떄 인덱스를 사용하지 않기 때문에 저장순서가 유지된다.
	 *    - 중복값을 허용하지 않는다.(Set)
	 *    - 저장된 값이 곧 저장된 위치가 된다.
	 *    - 대표 클래스 : HashSet, TreeSet
	 * 3. Map계열
	 *    - 담고자하는 값과 그 값을 꺼낼 수 있는 키를 함께 저장하는 클래스
	 *    - 값을 저장할 때 인덱스를 사용하지 않기때문에 저장순서가 유지되지 않는다.
	 *    - Key 값은 중복을 허용하지 않으나, value 값은 중복을 허용한다.
	 *    - 대표클래스 : HashMap, Properties
	 */
	
	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		
		//ArrayList list2 = new ArrayList(3); 
		ArrayList list2 = new ArrayList<String>(3); 
		//제네릭<E>
		//컬렉션에 저장할 댇체의 타입을 고정하기 위해 사용하는 타입 변수
		ArrayList<Music> list3 = new ArrayList<Music>(10);
		
		System.out.println(list3);
		
		//1. add(E e) : 리스트의 size에 e를 저장하는 메서드
		list3.add(new Music("someone like you","adel"));
		list3.add(new Music("너의이름을 부르고","박명수"));
		list3.add(new Music("벚꽃엔딩","장범준"));
		
		System.out.println(list3);
		
		//2. add(int index, E e) : 인덱스 위치에 e값을 추가하는 메서드.
		list3.add(1,new Music("바다의왕자","박명수"));
		//배열의 용량(capacity) 보다 더 많은 데이터를 저장하는 겨우 기존배열보다 크기가 1더큰 배열을 생성한후 깊은 복사를 한다
		
		System.out.println(list3);

		//3. set(int index, E e) : 리스트에 인덱스 위치의 값을e로 뱐경 시켜주는 메서드
		list3.set(0, new Music("불장난","블랙핑크"));
		System.out.println(list3);
		
		//4. remove(int index) : 잍덱스위치에 저장된 데이터를 삭제시켜주는 메서드
		list3.remove(0);
		System.out.println(list3);

		//5. size() : 리스트에 초기화된 데이터의 수를 반환해주는 메서드
		System.out.println("리스트에담긴 데이터의 수 : "+list3.size());
		
		//6. get(int index) : 인덱스 위치의 데이터를 반환해주는 메서드
		Music m = list3.get(0);
		System.out.println(m);
		System.out.println(m.getTitle());
		System.out.println(list3.get(1).getArtist());
		
		//7 contains(E e) : boolean -> e요소를 컬렉션이 포함하고 있는지 확인. 포함 한다면 true , 
		//                  포함하지않으면 false
		ArrayList<Integer> list4 = new ArrayList<>();
		list4.add(1);
		list4.add(9);
		list4.add(900);
		
		System.out.println(list4.contains(9));
		
		//indexOf(E e) : e요소가 컬렉션의 몇번 index에 있는지 확이하는 메서드
		System.out.println(list4.indexOf(500));//존재하지않으면 -1
		//equals 메서드 재정의 후 필드 값이 일치하므로 true
		System.out.println(list3.contains(new Music("벚꽃엔딩","장범준")));
		
		System.out.println(new Music("벚꽃엔딩","장범준").hashCode());
		System.out.println(new Music("벚꽃엔딩","장범준").hashCode());
		
		//반목문을 활용하여 데이터 출력
		for(int i = 0; i < list3.size();i++) {
			System.out.println(list3.get(i));
			
		}
		System.out.println("=================================");
		for(Music m2: list3) {
			System.out.println(m2);
		}
		System.out.println("==================================");
		//Iterator 반복자
		//컬렉션 내부 인자들을 Interator노 토큰단위로 관리.
		Iterator<Music> iter = list3.iterator();
		while(iter.hasNext()) {
			Music m2 = iter.next();
			System.out.println(m2);
		}
		
		System.out.println("0==================================0");
		
		//subList(int index, int index2) : 리스트의index부터 index2 전까지의 데이터를 추출하여 새로운
		//List를반환해주는 메서드
		
		List<Music> sub = list3.subList(0, 2);
		System.out.println(sub);
		
		//10. addAll(Collection c) : 현재 리스트에 컬렉션에 들어간 모든 데이터를 추가하는 메서드
		list3.addAll(sub);
		System.out.println(list3);
		
		//11. isEmpty() : 컬렉션이 비어있으면 true/ 아니며아먄 false
		System.out.println(list3.isEmpty());
		//12. clear() : 리스트를 비워주는 메서드
		//list3.clear();
		System.out.println(list3);
		System.out.println(list3.isEmpty());
		
		//13. sort() : 정렬 메서드
		System.out.println("================================");
		List<String> list5 = new ArrayList<>();
		list5.add("김경민");
		list5.add("다경민");
		list5.add("라경민");
		list5.add("나경민");
		
		System.out.println(list5);
		
		Collections.sort(list5);//기본정렬 조건에따라 정렬시켜주는 메서드, 오름차순 정렬
		
		System.out.println(list5);
		
		//역순으로 정렬하는 경우
		Collections.reverseOrder();//내림차순 정렬 조건을 가진 객체
		Collections.sort(list5,Collections.reverseOrder());
		System.out.println(list5);
		
		/*
		 * VO클래스응 정렬 하기위한방법
		 * 1. Comparable 이터페이스 상속
		 *  - VO클래스에 집접 상속시켜서 사용
		 *  - 해당 클래스의 기본정렬조건으로 적용 
		 * 
		 * 2. Comparator 인터페이스 상속
		 *  - 기본정렬조건 외의 추가 정렬조건을 만들고자 할떄 사용
		 *  - VO클래스 이외 별도의 클래스에 Comparator를 상속시켜 구현
		 */
		
		System.out.println("=======================================");
		//기본정렬조건 적용전
		// - 정렬 조건을 추가해야한다
		Collections.sort(list3);
		System.out.println(list3);
		
		//가수이름 내림차순 정렬
		// - 기본정렬 조건과 다르므로, Comparator를 사용
		Comparator<Music> comp = new MusicArtistDeScending();
		Collections.sort(list3, comp);
		
		System.out.println(list3);

		//14. Collections.shuffle() : 내부데이터를 섞는 메서드
		Collections.shuffle(list3);
		System.out.println(list3);
	}
	

}




















