package days06_Review;

import java.io.IOException;
import java.util.Scanner;

public class Home_Review04_02 {

	public static void main(String[] args) throws IOException {
		//가위바위보게임
		Scanner scanner = new Scanner(System.in);
		int user, com;
		char con;
		String regex = "[1-3]";
		String userStr;
		
		do {
			com = (int)((Math.random()*3)+1);
			
			do {
				System.out.print("> user 가위(1),바위(2),보(3) 선택 ? ");
				userStr = scanner.nextLine();
				} while (!userStr.matches(regex));
			
			user = Integer.parseInt(userStr);
			
			String rsp[] = {"", "가위", "바위", "보"};
			System.out.printf("유저 : %s, 컴퓨터 : %s" + "\n", rsp[user], rsp[com]);
			
			switch (user-com) {
			case 1: case -2: System.out.println("유저 승리!");break;
			case -1: case 2: System.out.println("컴퓨터 승리!");break;
			default:System.out.println("무승부!");break;
			}
			
			System.out.print("다시 하려면 'Y'를 입력하세요");
			con = (char) System.in.read();
			System.in.skip(System.in.available());
		} while (con=='y' || com=='Y');
		
		System.out.println("게임 종료!!");
		

	}//main

}//class




