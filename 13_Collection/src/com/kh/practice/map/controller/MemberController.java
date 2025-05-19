package com.kh.practice.map.controller;

import java.util.HashMap;

import com.kh.practice.map.model.vo.Member;
import com.kh.practice.map.view.MemberMenu;

public class MemberController {
	private HashMap<String ,Member> map = new HashMap();
	
	public boolean joinMembership(String id, Member m) {
		if(map.containsKey(id)) {
			return false;
		}
		map.put(id, m);
		return true;
		
		
	}
	public boolean logIn(String id, String password){
		if(map.containsKey(id) && map.)
		
		
	}
	public boolean changePassword(String id, String oldPw, String newPw){
		
	}
	public void changeName(String id, String newName) { 
		
	}
	public TreeMap sameName(String name){
		
	}
}
