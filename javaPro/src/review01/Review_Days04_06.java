package review01;

import java.util.Scanner;

public class Review_Days04_06 {
	
	public static void main(String[] args) {
	   // 4. 1~N 까지의 홀수의 합 ( for문, while 문 각각)
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("정수를 입력");
		
		int n;
		n = scanner.nextInt();
		
		int sum = 0;
		
		for (int i = 0; i <= n; i++) {
			if (i % 2 == 1) {
				sum+=i;
			}//if
		}//for
		scanner.close();
		
		System.out.printf("%d", sum);
		
	}//main

}//class





