package review01;

import java.util.Scanner;

public class Review_Days04_07 {
	
	public static void main(String[] args) {
	   // 4. 1~N 까지의 홀수의 합 ( for문, while 문 각각)
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수를 입력");
		int n;
		n = scanner.nextInt();
		
		int i = 1;
		int sum = 0;
		while (i < n) {
			if (i % 2 == 1) {
				sum += i;
			
			}//if
			
			i++;
			
		}//while
		
		System.out.printf("%d", sum);
		
		scanner.close();
		
	}//main

}//class





