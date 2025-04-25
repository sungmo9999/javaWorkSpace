package com.kh.practice.chap01.ControlPractice;

import java.util.Scanner;

public class ControlPractice {
	Scanner sc = new Scanner(System.in);
	
		public void practice1() {
		
		System.out.print("1. 입력 ");
		System.out.print("2. 수정 ");
		System.out.print("3. 조회 ");
		System.out.print("4. 삭제 ");
		System.out.print("7. 종료" );
		System.out.print("메뉴 번호를 입력하세요 :");
		
		int num = sc.nextInt();
		
		if (num == 1) System.out.println("입력 메뉴입니다.");
		if (num == 2) System.out.println("수정 메뉴입니다.");
		if (num == 3) System.out.println("조회 메뉴입니다.");
		if (num == 4) System.out.println("삭제 메뉴입니다.");
		if (num == 7) System.out.println("프로그램이 종료됩니다.");
		
	}
	
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 한 개 입력하세요: ");
		int num = sc.nextInt();
		
		
		if(num% 2 ==0 && num > 0) {
		    System.out.println("짝수다");
		}else if(num% 2 == 1 && num > 0){
			System.out.println("홀수다");
		}else {
			System.out.println("양수만 입력해주세요");
		}
			
		
			
		}
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어점수");
		int kor = sc.nextInt();
	
		System.out.print("수학점수");
		int math = sc.nextInt();
		
		System.out.print("영어점수");
		int eng = sc.nextInt();
		
		int total =  kor + math + eng;
		double avg = total / 3.0;
		
		boolean pass = kor >= 40 && math >= 40 && eng >= 40
				&& avg >= 60;
				
				if(pass) {
					System.out.println("국어 : "+kor);
					System.out.println("t어 : "+kor);
					System.out.println("영어 : "+kor);
					
					System.out.println("합격");
				}else {
					
				}
		
		
		
		
	}
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1 ~ 23 사이의 정수 입력");
		int month = sc.nextInt();
		
		String season = "";
		
		switch(month) {
		case 1 : case 12 : case 2:
			season = "겨울";
			break;
		case 3 : case 4 : case 5 :
			season = "봄";
			break;
		case 6 : case 7 : case 8 :
			season = "여름";
			break;
		case 9 : case 10 : case 11 :
			season = "가을";
			break;
		default :
			//season ="해당되는 계절이 없습니다."
			System.out.printf("%d월은 잘못 입력된 달입니다.", month);
			return;
		}
		System.out.printf("%d월은 %s입니다.", month, season);
		
		
		
		
			
		
		}
		
		
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		
		System.out.print("비밀번호 : ");
		String pwd = sc.nextLine();
		
		if(id.equals("myId") && pwd.equals("my Password12")) {
			System.out.println("로그인 성공");
			return;
		}
		
		if(!id.equals("myId")) {
			System.out.println("아이디가 틀렸습니다");
		} else {
			System.out.println("비밀번호가 틀렸습니다");
		}
	}
		
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("권환을 가지고자 하는 회원등급: ");
		String grade = sc.nextLine();
		
		switch(grade) {
		case "관리자" :
			System.out.print("회훤관리, 게시글 관리");
		case "회원" :
			System.out.print("게시글 조회, 댓글작성");
		case "비회원" :
			System.out.print("게시글 조회");
			break;
		default:
			System.out.println("존재하지 않는 등급입니다");
	
		}
		
		
	}
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("키(m)를 입력해 주세요 : " );
		double cm = sc.nextDouble();
		
		System.out.print("몸무게(kg)를 입력해 주세요 : " );
		double kg = sc.nextDouble();
		
		double bmi = kg / (cm * cm);
		System.out.println("BMI : " +bmi);
		
		
		
      	
      
		}
       

	
	 public void practice8() {
		 
		 System.out.print("피연산자1 입력");
		 int num1 = sc.nextInt();
		 
		 System.out.print("피연산자2 입력");
		 int num2 = sc.nextInt();
		 
		 System.out.print("연산자를 입력(+,-,*,/,%)");
		 char ch = sc.nextLine().charAt(0);
		 
		 if(ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '%');
		 System.out.println("잘못 입력했습니다. 프로그램 종료");
		 return;
	
      }
	 public void practice9() {
		 System.out.print("중간 고사 점수 : ");
		 int mid = sc.nextInt();
		 
		 System.out.print("기말 고사 점수 : ");
		 int finaltest = sc.nextInt();
		 
		 System.out.print("과제 고사 점수 : ");
		 int report = sc.nextInt();
		 
		 System.out.print("출석회수 : ");
		 int attend = sc.nextInt();
		 
		 double mid_final = mid* 0.2;
		 double final_final = finaltest*0.3;	 	
		 double report_final = report*1.0;
		 double attend_point = attend * 1.0;
		 
		 double total = mid_final + final_final + report_final + attend_point;
		 
		 System.out.println("============결과==========");
		 if(attend_point <= 14) {
			 System.out.println("FAil[출석부족("+attend+"/20]");
			 return;
			 
		 }
		 
		 if(total >=70) {
			 System.out.println("중간고사점수(20) : "+mid_final);
			 System.out.println("기말고사점수(20) : "+mid_final);
			 System.out.println("과제점수(20) : "+mid_final);
			 System.out.println("출석점수(20) : "+mid_final);
			 System.out.println("총점(20) : "+mid_final);
			 System.out.println("중간고사점수(20) : "+mid_final);
		 }
			 
		 	
		 
	 }
	 public void practice10() {
		 System.out.println("실행할 메서드를 번호로 선택하세요(1~9)");
		 int menu = sc.nextInt();
		 sc.nextInt();
		 
		 switch(menu) {
		 case 1 :
			 practice1();
				 break;
		 case 2 :
			 practice2();
				 break;
		 case 3 :
			 practice3();
				 break;
		 case 4 :
			 practice4();
				 break;
		 case 5 :
			 practice5();
				 break;
		 }
	 }
	 public void practice11() {
		 System.out.print("비밀번호를 입력(1000~9999)");
		 int pwd = sc.nextInt();
		 
		 if(!(pwd >= 1000 && pwd <= 9999)) {
			 System.out.println("자리수 안맞음");
			 return;
		 }
		 
		 //123
		 int first =pwd / 1000; //1.234=>1
		 int second = pwd / 100 % 10;//12%10=>2
		 int third =pwd / 10 % 10;//123.4=> 123=>12/3
		 int fourth = pwd % 10;
		 
		 //first와 second, third, fourth
		 //second와 third, fourth
		 //third와 fourth
		 if(first == second || first == third || first == fourth
				 || second == third || second == fourth
				 || third == fourth) {
			 System.out.println("중복값있음");
		 }else {
			 System.out.println("생성성공");
		 }
		 
		 }
		
	}
	 
	 
	 
	 
	
	
			
		

			
		
	


