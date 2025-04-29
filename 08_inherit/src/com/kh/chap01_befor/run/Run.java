package com.kh.chap01_befor.run;

import com.kh.chap01_befor.model.vo.Desktop;

public class Run {
	public static void main(String[] args) {
		Desktop d = new Desktop("삼성", "d-01","데스크탑" ,2000000 , true);
		
		System.out.println(d.information());
	}

}
