package days04;

import java.util.Scanner;

/**
 * @author dkrkdfla
 * @date 2024. 7. 4. - 오후 5:10:37
 * @subject
 * @content
 *
 */
public class Ex12 {

	public static void main(String[] args) {
		//1~n까지의 합
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수(n) 입력");
		int n = scanner.nextInt();
		
		
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			System.out.printf("%d+", i);
			sum += i;
			
		}//for
		
		System.out.printf("=%d", sum);

	}//main

}//class


/*
 * [문제1] 국어점수를 입력받아서 수/우/미/양/가 출력(if문)
 * [문제2] 국어점수를 입력받아서 수/우/미/양/가 출력(switch문)
 * [문제3] 1~10까지의 홀수의 합(for)
 * [문제4] 1~10까지의 홀수의 합(while)
 * [문제5] 두 정수(n,m)을 입력박아서 두 정수 사이의 합을 출력(for문, while문)
 */




