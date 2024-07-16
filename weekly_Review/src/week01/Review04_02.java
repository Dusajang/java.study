package week01;

import java.util.Scanner;

public class Review04_02 {

	public static void main(String[] args) {
		int user, com;
		Scanner scanner = new Scanner(System.in);
		com = (int)Math.random()*3+1;
	
		
		System.out.println("가위 바위 보를 시작합니다.");
		//System.out.println("가위 : 1, 바위 : 2, 보 : 3 를 입력하세요.");
		//user = scanner.nextInt();
			
		do {
			System.out.println("가위 : 1, 바위 : 2, 보 : 3 를 입력하세요.");
			user = scanner.nextInt();
			} while (user < 1 || user > 3);
		
		String[] rsp = {"", "가위", "바위", "보"};
		
		System.out.printf("유저 : %s, 컴퓨터 : %s\n"
				+ "", rsp[user], rsp[com]);
		
		
		switch (user - com) {
		case 1: case -2: System.out.println("유저 승리");break;
		case -1: case 2: System.out.println("컴퓨터 승리");break;
		default: System.out.println("무승부");break;
		}
		
		
		
		

	}//main

}//class

/*
4-2. 가위,바위, 보 게임을 구현하기
(조건, USER(사용자)의 선택을 입력할 때 1,2,3 이 아닌 값을 입력하면 유효성 검사를 해서 다시 입력받기)
*/





