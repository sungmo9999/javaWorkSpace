package com.kh.chap01_innerClass.part01_run;

import com.kh.chap01_innerClass.part01_instance.OuterClass;
import com.kh.chap01_innerClass.part02_static.model.vo.Member;

public class Run {
	public static void main(String[] args) {
		OuterClass oc = new OuterClass();
		//OuterClass.InnerClass inner = oc.new InnerClass();
		//oc.method();
		
		Member m = new Member
				.Builder()
				.setid("whtjdah")
				.setName("조성모")
				.setAge(30)
				.build();
	}
	/*
	 * 빌더크래스의 장덤
	 * - 불필요한 생성자들을 제거
	 * - 필드의 순서에 상관없이 객체생성 가능
	 * - 명시적인 메서드명으로 가독성 확보
	 * - vo클래스에 setter존자하지 않음으로서 불변성 유지가능
	 * - 올바른 값이 초기화 되었는지 buolder()를 통해 검증이 가능
	 */

}
