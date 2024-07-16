package review01;

import java.util.Scanner;

public class Review_Days04_04 {

	public static void main(String[] args) {
	     //2. 정수 입력받아서 홀수,짝수 출력( if문, switch문 각각)

	    Scanner scanner = new Scanner(System.in);
		int i;
		System.out.print("정수 입력");
		i = scanner.nextInt();
		
		switch (i % 2) {
		case 0: System.out.print("짝수"); break;
		case 1: System.out.print("홀수"); break;
		
		default : System.out.print("나머지"); break;
			
		}//switch
		
		scanner.close();
		
	}//main

}//class




