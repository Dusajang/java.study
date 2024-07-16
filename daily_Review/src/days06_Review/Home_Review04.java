package days06_Review;

import java.util.Scanner;

public class Home_Review04 {

	public static void main(String[] args) {
		//가위바위보게임
		Scanner scanner = new Scanner(System.in);
		int user, com;
		do {
			System.out.print("가위 : 1, 바위 : 2, 보 : 3 를 입력하세요.");
			user = scanner.nextInt();
		} while (user <1 || user > 3);
		
		com = (int) ((Math.random()*3)+1);
		
		String[] rsp = {"", "가위", "바위", "보"};
		
		System.out.printf("유저 : %s, 컴퓨터 : %s" +"\n", rsp[user], rsp[com]);
		
		switch (user-com) {
		case 1: case -2:System.out.println("유저 승리");break;
		case -1: case 2:System.out.println("컴퓨터 승리");break;
		
		default:System.out.println("무승부");break;
		}

	}//main

}//class
