package week01;

import java.util.Scanner;

public class Review05 {

	public static void main(String[] args) {
		// 5. 두 정수(n,m)을 입력받아서 두 정수 사이의 합출력
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("두 정수(n,m)을 입력해주세요.");
		
		int n,m;
		int sum = 0;
		
		n = scanner.nextInt();
		m = scanner.nextInt();
		
		int temp;
		if (n>m) {
			temp = n;
			n = m;
			m = temp;
		}
		
		for (int i = n; i <= m; i++) {
			System.out.printf("%d+", i);
			sum += i;
		}
		
		System.out.printf("=%d", sum);
		
		

	}//main

}//class
