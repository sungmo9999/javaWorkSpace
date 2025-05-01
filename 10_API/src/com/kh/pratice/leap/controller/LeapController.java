package com.kh.pratice.leap.controller;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class LeapController {
	public boolean isLeapYear(int year) {
		boolean result;
		int year = now.getear();
		 
		 if((result % 4 ==0 && result % 100!=0)||result/ 400 == 0) {
			 System.out.println(result+ "년은 윤년입니다.");
		 }else {
			 System.out.println(result+"년은 평년입니다.");
		 }
		
	}
	public long leapDate(Calendar c) {
		
		
	}

}
