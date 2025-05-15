package com.kh.Practice1;

interface StringChecker{
	boolean check(String s);
}

public class LamdaPractice1 {
	
	public static void main(String[] args) {
		
		String[] arr = {"javq", "lambda", "hi", "Function", "wow"};
		printStrings(arr, s -> s.length() >= 5); 
		
	}
	public static void printStrings(String[] arr, StringChecker checker) { 
        for (String str : arr) { 
            if (checker.check(str)) { 
                System.out.println(str); 
            } 
        } 
	}
	
}
