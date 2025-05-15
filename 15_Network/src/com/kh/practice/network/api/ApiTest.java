package com.kh.practice.network.api;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;

public class ApiTest {
	public static void main(String[] args) {
		
		try {
		String requestUrl = "http://apis.data.go.kr/B552584/MsrstnInfoInqireSvc/getMsrstnList";
		String servicKey = "byNHmquq2WIcjwwrJRFpvNnR%2BNXJVx3yi2TX%2BNxcGN6SGCGeIoerYMStvJPY2oMMl9eq8ejqxkwnOVhwU1Y7qQ%3D%3D";
		String stationName =  URLEncoder.encode("종로구","UTF-8");
		String dataterm = "DAILY";
		requestUrl += "?servicKey="+servicKey;
		requestUrl += "&stationNAme"+stationName;
		requestUrl += "dataterm"+dataterm;
		
		URL url = new URL(requestUrl);
		
		URLConnection conn = url.openConnection();
		
		
		
		
		
		
		
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
