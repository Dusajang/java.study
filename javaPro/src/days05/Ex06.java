package days05;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		//[문제5] 두 정수(n,m)을 입력박아서 두 정수 사이의 합을 출력(for문, while문)
		Scanner scanner = new Scanner(System.in);
		int n, m ;
		int sum = 0;
		System.out.print("> 두 정수(n, m) 입력?");
		n = scanner.nextInt();
		m = scanner.nextInt();
		
		//3. 풀이
		int min = n > m ? m : n;					//Math.min(n, m)
		int max = Math.max(n, m);
		for (int i = min; i <= max; i++) {
			System.out.printf("%d+", i);
			sum+=i;
	    }
		
		
		
		
		// 2. 풀이
		/*
		if ( n > m) {
			int temp = n;
			n = m;
			m = temp;
			}
		*/
		
		
		
		/*1번 풀이
		if (m > n) {
			for (int i = n; i <= m; i++) {
				System.out.printf("%d+", i);
				sum+=i;
		} else {
			for (int i = m; i <= n; i++) {
				System.out.printf("%d+", i);
				sum+=i;
		    }
	     }
     }		
		int sum = 0;
		for (int i = n; i <= m; i++) {
			System.out.printf("%d+", i);
			sum+=i;
			
		}//for
		System.out.printf("=%d", sum);
		*/
	}//main

}//class






