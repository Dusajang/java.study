package days06_Review;

import java.util.Arrays;
import java.util.Iterator;

public class Ex05 {

	public static void main(String[] args) {
		// 1~100 까지의 임의의 정수      10개 배열 m
				// 합
				// 갯수
				// 평균
				// 최대값
				// 최소값
		int[] m = new int[10];
		int sum = 0;
		
		for (int i = 0; i < m.length; i++) {
			m[i] = (int) ((Math.random()*100)+1);
			sum += m[i];
		}
		
		System.out.println(Arrays.toString(m));
		
		System.out.printf("sum : %d\n", sum);
		int count = m.length;
		System.out.printf("count : %d\n", count);
		
		double avg = sum/m.length;
		System.out.printf("avg : %.2f\n", avg);
		
		int max = m[0];
		for (int i = 1; i < m.length; i++) {
			max = Math.max(max,m[i]);
		}
		System.out.printf("max : %d\n", max);
		int min = m[0];
		for (int i = 1; i < m.length; i++) {
			min = Math.min(min, m[i]);
		}
		System.out.printf("min : %d",min);
		

	}//main

}//class
