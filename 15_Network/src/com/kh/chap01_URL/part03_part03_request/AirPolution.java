package com.kh.chap01_URL.part03_part03_request;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class AirPolution {
	/*
	 * URLConnection 활용예시
	 * 1) 웹크롤링
	 * 2) API 요청
	 * 
	 * API
	 *  - API서버 : 애플리션간의 통신에서 데이터를 제공해주는 서버
	 *  - API : 애플리케이션간의 통신에서 데이터를 주고받기위한 설명서(인터페이스)
	 *  
	 *  
	 *  API서버 주소
	 *   https://www.data.go.kr/data/15073861/openapi.do
	 *   한국 환경공단_대기오염정보
	 */

	public static void main(String[] args) {
		String requestUrl = "http://apis.data.go.kr/B552584/ArpltnInforInqireSvc/getMinuDustFrcstDspth";
		String servicKey = "byNHmquq2WIcjwwrJRFpvNnR%2BNXJVx3yi2TX%2BNxcGN6SGCGeIoerYMStvJPY2oMMl9eq8ejqxkwnOVhwU1Y7qQ%3D%3D";
		
		//요청주소에 "퀘리스트링" 으로 요청변수를 묶어주기 &붙이기
		requestUrl += "?servicKey="+servicKey;
		requestUrl += "&pageNo=1";
		
		try {
			URL url = new URL(requestUrl);
			
			URLConnection conn = url.openConnection();
			//입출력 스트림 생성
			BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			
			String line;
			while( (line = br.readLine()) != null) {
				System.out.println(line);
			}
			br.close();
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
