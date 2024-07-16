package ch01.verify;

import java.util.Arrays;
import java.util.Scanner;

public class Qqq {

	public static void main(String[] args) {
		//1~10 까지 합 출력 ( for문, while문 각각) 
		/* for
		int sum = 0;
		for (int i = 0; i <=10; i++) {
			sum += i;
		}//for
		System.out.printf("%d", sum);
		*/
		
		/* while
		int i = 0;
		int sum = 0;
		while (i <= 10) {
			sum += i;
			i++;
		}//while
		System.out.printf("%d", sum);
		*/
		
		
		// 2. 정수 입력받아서 홀수,짝수 출력( if문, switch문 각각)
		/* if
		int i;
		Scanner scanner = new Scanner(System.in);
		System.out.printf("정수 입력");
		i = scanner.nextInt();
		
		if (i % 2 ==0) {
			System.out.print("짝수");
		} else {
			System.out.print("홀수");
		} 
		scanner.close();
		*/
		
		/*
		int i;
		Scanner scanner = new Scanner(System.in);
		System.out.printf("정수 입력");
		i = scanner.nextInt();
		
		switch (i % 2) {
		case 0: System.out.print("짝수");break;
		case 1: System.out.print("홀수");break;
		}//switch
		*/
		
		
		/*
		// 3. 입력값을 split() 해서 처리하는 문제
		// 사과, 바나나, 수박, 포도, 복숭아
		String srt;
		Scanner scanner = new Scanner(System.in);
		System.out.print("과일들 배열해보세요.");
		srt = scanner.next();
		
		String[] fruit = srt.split("\\\\s*,\\\\s*");
		*/
		
		
		/*
		// 4. 4. 1~N 까지의 홀수의 합 ( for문, while 문 각각)
		System.out.print("정수 입력");
		Scanner scanner = new Scanner(System.in);
		int n;
		n = scanner.nextInt();
		
		int sum = 0;
		
		for (int i = 1; i <= n; i++) {
			if (n % 2 == 1) {
				sum+=i;
			}//if
			
		}//for
		System.out.printf("%d", sum);
		*/
		
		
		
	}//main

}//class







