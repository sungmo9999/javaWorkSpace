package com.kh.chap01_list.arrayList.model.vo;

import java.util.Objects;

public class Music implements Comparable<Music> {
	private String title;
	private String artist;
	
	public Music (){
	
		
	}
	

	public Music(String title, String artist) {
		super();
		this.title = title;
		this.artist = artist;
	}


	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}
	
	/*
	 * equals 메서드 재정의
	 *  - 각 객체간의 필드값이 동일하다면 같은객체가 될 수 있도록 오버라이딩
	 */
	@Override
	public boolean equals(Object o) {
		
		if(!(o instanceof Music)) {
			return false;
		}
		
		Music other = (Music) o;
		
		if(this.title .equals( other.title) && this.artist == other.artist) {
			return true;
		}
		return false;
	}
	
	/*
	 * hashCode()
	 *  - 오버라이딩 하기전에는 객체가 저장된 주소값을 10진수 형태로 반환해주는 함수
	 *  - 단, equals메서드를 오버라이딩 한다면 hashCode()메서드도함꼐 오버라이딩 해줘야한다
	 *  - hashCodew는 hashMap hashSet
	 *  - hashCode는 오버라이딩 하지 않고, equals메서드미ㅏㄴ 오버라이딩 하면 논리적으로 두 객체는 같지만
	 *  - 데이터가 저장될때는 다른 주소값을 가지므로 중복으로 데이터가 저장된다.
	 */
	@Override
	public int hashCode() {
		return Objects.hash(title, artist);
	}

	@Override
	public String toString() {
		return "Music [title=" + title + ", artist=" + artist + "]";
	}


	@Override
	public int compareTo(Music o) {
		/*
		 * 현재 객체와 매개변수로 전달된 객체간의 비교수정
		 * 양수 ,0 음수인경우 반환되도록 설정
		 * 
		 * 양수 ->자리유지
		 * 0 : 자리유지
		 * 음수->자리교테
		 */
		//제목기준 오름차순 정렬
		//현재객체 비교 다른객체 ==> 오름차순정렬
		//다른객체 비교 현재객체 ==> 내림차순정렬
		//return this.title.compareTo(o.title);
		return o.title.compareTo(this.title);//내림차순
		
	}

}
