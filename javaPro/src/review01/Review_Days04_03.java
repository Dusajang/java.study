package review01;

import java.util.Scanner;

public class Review_Days04_03 {

	public static void main(String[] args) {
	     //2. 정수 입력받아서 홀수,짝수 출력( if문, switch문 각각)

		Scanner scanner = new Scanner(System.in);
		int i = 0;
		System.out.print("정수 입력");
		
		if (i % 2 ==0) {
			System.out.print("짝수");
		} else {
			System.out.print("홀수");
		}//ifelse
		
		scanner.close();
		
	}//main

}//class




