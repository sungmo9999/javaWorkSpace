package com.kh.chap04_mpa.part02_clone.run;

import com.kh.chap04_mpa.part01_hashMap.model.vo.Snack;

public class HashMapRun <K , V> {
	private Entry[] table;
	private int capacity; //배열의 크기
	private int size; //초기화된수

	class Entry<K , V>{
		K key;
		V value;
		Entry<K , V> next;
		
		public Entry(K key, V value, Entry<K , V> next) {
			this.key = key;
			this.value = value;
			this.next = next;
		}
	}
	
	public HashMapRun(int capacity) {
		this.capacity = capacity;
		table = new Entry [capacity];
		
	}
	public static void main(String[] args) {
		HashMapRun<String, Snack> hm = new HashMapRun<>(10);//크기10
		hm.put("다이제", new Snack("초코맛",800));
		hm.put("칸초", new Snack("단맛", 600)); 
		hm.put("새우깡", new Snack("짠맛", 500)); 
		hm.put("포테이토칩", new Snack("짠맛", 500));
		
		System.out.println(hm.get("새우깡"));
		hm.put("새우깡", new Snack("매운맛",700));
		System.out.println(hm.get("새우깡"));
		
		hm.remove("포테이토칩");
		System.out.println(hm.get("포테이토칩"));
		System.out.println(hm);
		
		
		
	}
	public int getIndex(K key) {
		//매개변수로 전달 받은 key를 활용하여 table의 저장할때 인덱스 위치를 구하는 함수
		//key  값에 hashcode()활용
		//hashcode값이 옴수 일수 있으므로 ,절대값으로 변화
		//배열의 크기만큰 나머지연산 수행
		//113355 %10 =>5번인덱스
		//12345678 % 10 =>8번인덱스
		//77777788 % 10 =>8번인덱스
		return Math.abs (key.hashCode()) % capacity;
		
	}
	public void put(K key, V value) {
		int index = getIndex(key);
		
		Entry<K, V> newEntry = new Entry<>(key, value, null);
		
		//table위치의 index 초기화
		if(table[index]== null) {
			table[index]=  newEntry;
		}else {
			//index위치에 이미 초기화된 데이터가 들어가 있다면?
			//다이제 , 다이제 => 중복 키값
			// - 덮어쓰기
			if(table[index].key.equals(newEntry.key)) {
				table[index].value = newEntry.value;
				return; //size가 추가되지 않도록 완료
			}else {
			
			//다이제, 칸초, 칸쵸 =>우연히 hashcode중복으로 충돌이 발생한경우
			//- 다이제가 저장된 entry의 next에 칸초를 저장
				
			//다이제 칸쵸 새우깡 모든 같은 인덱스를 공유하는 경우
			Entry<K , V> next = table[index];
				while(true) {
					if(next.key.equals(newEntry.key)) {
						next.value = newEntry.value;
						return;
					}
					
					if(next.next == null) {
						next.next = newEntry;
						break;
					}
					//
					next = table[index].next;
				}
			}
		}
		size++;
		
	}
	public V get(K key) {
		// getIndex함수 호출후 반환값으로 table의 index에 접근  
		int index = getIndex(key);
		
		// 접근시 내부의 값이 null이라면 null값 반환
		
		Entry<K, V> e = table[index];
		if(e == null) {
			return null;
		}else {
			// 객체가 있다면 저장된 객체의 key값과 매개변수로 전달받은 key값 확인
			do {
				if(e.key.equals(key)) {
					return e.value;
				}
				e= e.next;
			}while(e != null);
		
		}
		return null;
		// 동일하다면 객체에 저장된 value값 반환. 
		// 동일하지 않다면 노드드의 next 값을 찾아 다시한번 검사 (next가 존재하지  
		// 않을때까지 반복). 다음 노드들 중에서 key값이 일치하는 값이 존재한다면  
		// 노드 내부의 value값 반환. 일치하는 key값이 없었다면 null값 반환
	}
	public void remove(K key) {
		int index = getIndex(key);
		Entry<K,V> e = table[index];
		
		if(e == null) {
			return;
		}
		Entry<K, V> prev = null;
		do {
		if(e.key.equals(key)) {
			//첫번째 entry인지 확인
			if(e == table[index]) {
				//e.next값이 null이 아니라면 e.next값을 대입
				table[index] = (e.next != null? e.next : null);
			}else {
				prev.next = e.next;
			}
			size--;
			return;
		}
		prev = e;
		e = e.next;
		}while(e !=null);
	}
	public int size() {
		return size;
	}
	
	public boolean containsKey(K key) {
		int index = getIndex(key);
		
		Entry <K, V> e = table[index];
		if(e == null) {
			return false;
		}
		do {
			if(e.key.equals(key)) {
			return true;
		}
			e = e.next;
		}while(e != null);
		
		return false;
	}

	
	public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('{');
        for(Entry e : table) {
            if(e == null) continue;
            // {key : value}
            sb.append("{").append(e.key).append(" : ").append(e.value).append("}").append(",");
            Entry next = e.next;
            do {
                if(next != null) {
                    sb.append("{").append(next.key).append(" : ").append(next.value).append("}").append(",");
                    next = next.next;
                }
            }while(next != null); //
        }
        //sb.append(Arrays.toString(table));
        sb.append('}');
        return sb.toString();
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
