package com.kh.chap03_stream.part03_optional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalMethods {
	/*
	 * Optional
	 *  - 스트림에서 null(비어있는값) 값을 안전하게 다루기위한 클래스
	 *  - 존재할 수 도있고 안할 수도있는 객체를 다루기 위한 클래스
	 *  - Optional로 다루게될 변수는 변수명에 암묵적으로 Optional임을 나타내는 키워들 추가해야한다
	 *  ex) maybexxx optxxx
	 */
	
	public static void main(String[] args) {
		
//		List<String> list = Arrays.asList("홍길동","신사",null,"");
//		list.stream()
//			.forEach((str) -> {
//				System.out.println(str+" : "+ getStrLength(str));
//			});
		
		Member member = new Member();
		member.setEmail("whtjadh@naver.com");
		
		Order order = new Order();
		order.setMember(member);
		System.out.println(getEmailOfMember(order));
		System.out.println(getEmailOfMember(null));
		System.out.println(getEmailOfMember(new Order()));
		
	}
	public static String getEmailOfMember(Order order) {
		//사용자의 이메일을 "안전하게" 얻어오기
//		if(order != null) {
//			Member m = order.getMember();
//			if(m != null) {
//				String email = m.getEmail();
//				return email;
//			}
//		}
//		return null;
		
		//옵셔널을 통한 null값처리
		
		
		return Optional
			.ofNullable(order)
			.map(or -> or.getMember())
			.map(mem -> mem.getEmail())
			.orElse("메일이 존재하지 않습니다");
	}
	
	public static int getStrLength(String str) {
		//Optional을 통해 null처리
		//Optional 객체생성
		//1. Optional.empty(): 비어있는 옵셔널
		//2. Optional.of(obj) : null이 아닌 객체를 담은 옵셔널 객체
		//3. Optional.ofNullable(obj) : null일수도 있는 겍체를 담은 옵셔널 객체
		Optional<String> maybeStr = Optional.ofNullable(str);
		return maybeStr.map(s -> s.length())//s가 null이 아닌경우
		//orElse(0);// s가 null인경우
		//orElseGet(()-> 0); //s가 null인경우 람다식
		.orElseThrow(()-> new RuntimeException());
		
		
		
		
		
	}
	
	
	static class Order {
        Member member;
        int count;
        public Order() {
        }
        public Member getMember() {
            return member;
        }
        public void setMember(Member member) {
            this.member = member;
        }
        public int getCount() {
            return count;
        }
        public void setCount(int count) {
            this.count = count;
        }
        public Order(Member member, int count) {
            super();
            this.member = member;
            this.count = count;
        }
        @Override
        public String toString() {
            return "Order [member=" + member + ", count=" + count + "]";
        }
    }
    static class Member {
        String id;
        String email;
        public Member() {
        }
        public String getId() {
            return id;
        }
        public void setId(String id) {
            this.id = id;
        }
        public String getEmail() {
            return email;
        }
        public void setEmail(String email) {
            this.email = email;
        }
        public Member(String id, String email) {
            super();
            this.id = id;
            this.email = email;
        }
        @Override
        public String toString() {
            return "Member [id=" + id + ", email=" + email + "]";
        }
    }

}

