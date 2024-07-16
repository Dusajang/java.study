package days06;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		/*
		2. Math.random() 메서드를 사용해서 
		   1) 임의의 국어점수(0~100)을 발생하는 코딩하기
		   2) 임의의 로또 번호(1~45)를 발생하는 코딩하기
		   3) 임의의 정수(45~87)를 발생하는 코딩하기
		   */
		int user, com;
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("가위 : 1, 바위 : 2, 보 : 3 를 입력하세요.");
			user = scanner.nextInt();
		} while (user <1 || user >=3);
		
		com = (int)Math.random()*3+1;
		
		String[] rsp= {"", "가위", "바위", "보"};
		
		System.out.printf("유저 : %s, 컴퓨터 : %s \n", rsp[user], rsp[com]);
		
		switch (user - com) {
		case 1: case -2: System.out.println("유저 승리");break;
		case -1: case 2: System.out.println("컴퓨터 승리");break;
		default: System.out.println("무승부");break;
		}
		
		

	}//main

}//class








