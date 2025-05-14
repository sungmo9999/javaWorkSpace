package com.kh.chap02_udp.server;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UDPServer {
	
	/*
	 * UDP
	 *  - 비연결형 프로토콜로 클라이언트가 데이터를 받았는지 아닌지 상관하지 않는 전송방식
	 *  - 데이터 손실이 발생할수 있다. 
	 *  - 빠른 데이터 전송이 중요한 실시간 스트리밍, 게임등에서 사용된다
	 *  
	 * DatagramSocket
	 *  - UDP통신에서 DataSocket 을 보내고 받는데 사용하는 클래스
	 *  - DatagramSocket을 수신하거나 전송할 수있으며 클라이언트와 서버에 각각 하나의 
	 *    DatagramSocket을 만들어두고 이를 통해 송수신함
	 *    
	 * DatagramPacket
	 *  - UDP통신시 데이터를 포장하는클래스
	 *  - 전송할 데이터와 함꼐 호스트의 IP주소 및 포스트 번호를 포함하여 보낸다
	 *  
	 * Datagram
	 *  - UDP에서 사용하는 데이터 전송 단위
	 */
	public static void main(String[] args) {
		// 서버의 포트번호 설정
		int serverPort = 30001;
		try {
			DatagramSocket socket = new DatagramSocket(serverPort);
			
			byte[] data = new byte[1024];
			DatagramPacket packet = new DatagramPacket(data, data.length);
			
			//클라이엍트가 데이터를 전달하기까지 대기
			socket.receive(packet);//
			
			// 클라이언트의ip주소와 포트번호 확인
			InetAddress clientAddress = packet.getAddress();
			System.out.println(clientAddress+" "+packet.getPort());
			
			String str = "UDP SERVER에서 전송하는 데이터!!";
			
			//문자열을 바이트배열로 변경
			byte[] serverDate = str.getBytes();
			
			DatagramPacket packet2 = new DatagramPacket(serverDate, serverDate.length, clientAddress, packet.getPort());
			
			socket.send(packet2);//클라이언트가 receive중이라면 데이터를 수신 가능
			socket.close();
			
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
















