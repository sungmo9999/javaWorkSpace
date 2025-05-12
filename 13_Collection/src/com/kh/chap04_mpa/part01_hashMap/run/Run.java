package com.kh.chap04_mpa.part01_hashMap.run;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

import com.kh.chap04_mpa.part01_hashMap.model.vo.Snack;

public class Run {
	public static void main(String[] args) {
		/*
		 * HashMap?
		 *  - 많은 양의 데이터를 빠르게 저장하고 관리하기위햐여 key value 값을 함께 묶어서 돤리하는 자료 구조
		 *  -계층구조응 보면 List, Set계열과 다른 Map 계열 인터페이스만 상속하는 쿨래스로 사용하는 메서드가 다르다
		 *  -데이터를 저장 할때 key velue를 한쌍으로 저장하고 key를 통해 velue가 저장된 위치에 접근하다
		 *  -key 값을 중복 허용하지 않는다
		 *  -동일한 key값에 데이터를 저장하면 마지막으로 추가된velue값이 저장된다 
		 */
		HashMap<String, Snack> hm = new HashMap<>();
		//문자열 key 값에 Snack value를 저장함
		
		//1. put(K key, V velue): mpa공간에 key,value를 세트로 추가하는 메서드.
		hm.put("다이제", new Snack("초코맛",1500));
		hm.put("칸초", new Snack("초코맛",600));
		hm.put("새우깡", new Snack("짠맛",500));
		hm.put("포테토칩", new Snack("짠맛",500));
		
		System.out.println(hm);
		
		
		hm.put("새우깡", new Snack("매운 새우깡",700));//key 값이 중복된경우 마지막 value로 덮어 쓰의워짐
		System.out.println(hm);
		
		//2. get(K key) : V =>Hashmap에서 key 와 일치하는 value값을 찾는 메서드
		System.out.println(hm.get("다이제"));
		
		//3. size() => hashmap에 최기화된 데이터 수.
		System.out.println(hm.size());
		
		//4. rrplace(K key, v value) = > hashmap에서 key 값과 일치하는 값을 찾아, 새로 전달괸value로 교체하는 메서드
		hm.replace("포테토칩",new Snack("피자맛",1000));
		System.out.println(hm);
		
		//5. remove(Key y) => hashmap에서 key 값과 일치하는 값을 찹아서 삭제해주는 메서드
		hm.remove("칸초");
		System.out.println(hm);
		
		//hashmap 반복문 돌리기
		System.out.println("=============================================");
		
		//hashmap
		
		//1. keySet()을 활용한 반복
		//    - hashmap의 key값들을 따로 Set에 담아서 반환해주는 메서드
		Set<String> keySet = hm.keySet();
		
		System.out.println(keySet);
		for(String key : keySet) {
			System.out.println(hm.get(key));
		}
		
		//2.entrySet()을 활용한 반복
		//    - hashmap의 key,value값이 담긴 entry를 Set에 담아서 반환해주는 메서드
		Set<Entry<String,Snack>> entrySet = hm.entrySet();
		Iterator<Entry<String,Snack>> iter = entrySet.iterator();
		
		while(iter.hasNext()) {
			Entry<String, Snack> entry = iter.next();
			System.out.println("key : " + entry.getKey());
			System.out.println("value : "+entry.getValue());
		}
		
		
		
		
	}

}
