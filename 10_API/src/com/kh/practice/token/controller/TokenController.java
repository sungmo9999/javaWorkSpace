package com.kh.practice.token.controller;

import java.util.StringTokenizer;

public class TokenController {
	
	public void TokenController() {
		
	}
	public String afterToken(String str) {
		
		StringTokenizer stn = new StringTokenizer(str ," ");
		
		StringBuilder sb = new StringBuilder();
		while(stn.hasMoreTokens()) {
			sb.append(stn.nextToken());
		}
		
		return sb.toString();		
		
		
		
	}
	public String firstCap(String input) {
		
		String firstWorld = input
				.substring(0,1)
				.toUpperCase()
				.concat(input.substring(1));
		
		return firstWorld;
		
		
		
	}
	public int findChar(String input, char one) {
		char[] arr = input.toCharArray();
		
		int count = 0;
		for(char ch : arr) {
			if(ch ==one) {
				count++;
			}
		}
		return count;
	}
	

}
