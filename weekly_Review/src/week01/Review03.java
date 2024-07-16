package week01;

import java.util.Scanner;

public class Review03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int i =0;
		while (i < 256) {
			if (i % 10 == 0) {
				System.out.printf("%d : ", i/10 + 1);
			}
			System.out.printf("[%c]", i);
			if (i % 10 ==9) {
				System.out.println();
			}
			i++;
			
			if (i == 100) {
				System.out.print("Enter를 입력하여 진행하세요.");
				scanner.nextLine();
			}
		}//while
		scanner.close();

	}//main

}//class


/*
3. ASCII 코드값을 한 라인에 10개씩 출력하면 라인넘버를 붙이고
10라인을 출력하면 계속할거냐고 물어보고 엔터를 치면 다시 10라인씩
출력하는 코딩하기
*/