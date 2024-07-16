package week02;

import java.util.Arrays;

public class Week02_Review01 {

	public static void main(String[] args) {
//		1. 버블정렬하는 메서드 선언 ( bubbleSort ) 
//		  (조건: 내림차순 정렬(desc) )
		int[] m = {3,5,4,7,6,1,2};
		
		bubbleSort(m);
		System.out.println(Arrays.toString(m));
		
		
		

	}//main

	private static void bubbleSort(int[] m) {
		// 내림차순 버블정렬
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6-i; j++) {
				//System.out.printf("%d-%d ", j , j+1 );
				if (m[j]<m[j+1]) {
					//System.out.print("change");
					int temp = m[j];
					m[j] = m[j+1];
					m[j+1] = temp;
					
				}
				//System.out.println(Arrays.toString(m));
			}
			//System.out.println();
		}
		
	}//bubbleSort

}//class
