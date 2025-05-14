package com.kh.practice.network.ip;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.Scanner;

public class IPSearch {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		
		System.out.print("도메인명 : ");
		String str = sc.nextLine();
		
	      
		try {
			InetAddress[] arr = InetAddress.getAllByName(str);
			 int count = arr.length;
	            if (count > 0) {
	                System.out.println(str + "는 " + count + "개의 IP주소를 가지고 있습니다.");
	                for (int i = 0; i < count; i++) {
	                    System.out.println((i + 1) + "번 IP = " + arr[i].getHostAddress());
				}
				
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
}

}





