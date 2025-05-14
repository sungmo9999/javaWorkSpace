package com.kh.chap01_URL.part01_basic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.util.Arrays;
public class Run {
	
	public static void main(String[] args) {
		Run run =new Run();
		//run.test1();
		//run.test2();
		run.test1();
		
	}
	
	public void test1() {
		/*
		 * InetAddress
		 * -IP주소에 대한 정보를 가진 클래스
		 * -ip: 4,6로 이루워진 인터넷 주소
		 * -hostname : naver.com, khedu.or.kr
		 * - 모든 메소드가 static
		 */
		try {
			InetAddress naver = InetAddress.getByName("naver.com");
			System.out.println(naver.getHostAddress());	
			InetAddress google = InetAddress.getByName("google.com");
			System.out.println(google.getHostAddress());
			
			InetAddress[] arr =InetAddress.getAllByName("google.com");
			System.out.println(Arrays.toString(arr));
			
			//내컴퓨터 ip주소
			// - localhost
			// -127.0.0.1 루프백 ip.
			InetAddress locaihost = InetAddress.getLocalHost();
			System.out.println(locaihost);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}	
	}
	
	public void test2() {
		/*
		 * URL
		 * - 인터넷상에 존재하는 서버들이 자원에 접근할 수 있는 주소
		 * - 자바에서는 URL클래스로 URL자원을 다룰수있다
		 * - 실제 URL 자원에 대한 객체를 생성하여 자원에 연결하고, 데이터를 읽어올 수 있다.
		 *
		 * URL구조
		 * - https://khedu.co.kr:443/project/teamView.kh?no=5385&cpage=1
		 * protocol: 통신규약 (http, ftp, mtp, file,...)
		 * hostname: 도매인이름(IP주소)	khedu.co.kr
		 * port	   : 서비스 번호, 호스트내 특정 서비스를 가리키는 논리적인 번호. 포트번호별로 다양한 서비스를 제공할 수 있다. 프로토콜별 생략가능 443 https 기본포트, 80 http 기본포트
		 * 자원경로  : 호스트네임+포트 내부에서 자원이 존재하는 세부 경로	/project/teamView.kh
		 * querystring: 자원을 얻기위해 서버에 전달해야하는 값들	?no=5385&cpage=1
		 *
		 * */
		try {
			URL url =new URL("https://www.google.com/search?q=%EC%84%A0%EA%B1%B0&oq=%EC%84%A0%EA%B1%B0&gs_lcrp=EgZjaHJvbWUyBggAEEUYOTINCAEQABiDARixAxiABDINCAIQABiDARixAxiABDINCAMQABiDARixAxiABDINCAQQABiDARixAxiABDINCAUQABiDARixAxiABDINCAYQABiDARixAxiABDINCAcQABiDARixAxiABDINCAgQABiDARixAxiABDIGCAkQABgD0gEJMjgyN2owajE1qAIIsAIB&sourceid=chrome&ie=UTF-8");
			System.out.println(url.getProtocol());
			System.out.println(url.getHost());
			System.out.println(url.getPort()+":::"+url.getDefaultPort());
			System.out.println(url.getPath());
			System.out.println(url.getQuery());
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		
		
	}
	
	public void test3() {
		/*
		 * URLConnecyion
		 * - 원격서버와 통신하여 자원을 입출력할수있는 스트림을 제공하는 클래스
		 * -URL로 연결한 자원을 기술
		 */
		
		String address = "https://www.google.com/search?q=%EC%84%A0%EA%B1%B0&oq=%EC%84%A0%EA%B1%B0&gs_lcrp=EgZjaHJvbWUyBggAEEUYOTINCAEQABiDARixAxiABDINCAIQABiDARixAxiABDINCAMQABiDARixAxiABDINCAQQABiDARixAxiABDINCAUQABiDARixAxiABDINCAYQABiDARixAxiABDINCAcQABiDARixAxiABDINCAgQABiDARixAxiABDIGCAkQABgD0gEJMjgyN2owajE1qAIIsAIB&sourceid=chrome&ie=UTF-8";
		BufferedReader br =null;
		BufferedWriter bw =null;
		
		try {
			URL url =new URL(address);
			URLConnection conn = url.openConnection();
			
			br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			bw = new BufferedWriter(new FileWriter("naver_search.html"));
			
			String data = "";
			while((data = br.readLine()) != null){
				bw.write(data);
				bw.newLine();
			}
			System.out.println("검색경과 저장온료");
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}


}














