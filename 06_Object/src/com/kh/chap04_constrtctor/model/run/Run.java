package com.kh.chap04_constrtctor.model.run;

import com.kh.chap04_constrtctor.model.vo.User;

public class Run {
	public static void main(String[] args) {
		User user = new User();
		
		User user2 = new User("user01", 20, '남');
	}

}
