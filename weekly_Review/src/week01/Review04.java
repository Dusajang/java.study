package week01;

import java.util.Arrays;

public class Review04 {

	public static void main(String[] args) {
		int kor =(int) (Math.random()*101);
		System.out.printf("국어점수 : %d\n", kor);
		
		
		//int lotto = (int) (Math.random()*46+1);
		int[] lottoarr = new int[6];
		
		
			
		// [45][][][][][] *****
		for (int k = 0; k < 100; k++) {
			 
			System.out.printf("[%d]  ", k);
			
			 for (int i = 0; i < lottoarr.length; i++) {
		            lottoarr[i] = (int) (Math.random() * 45 + 1);
		            for (int j = 0; j < i; j++) {
		                if (lottoarr[i] == lottoarr[j]) {
		                    i--; // 중복된 경우, 중복이 일어난 시점부터 다시
		                }
		            }
		        }
			 System.out.println( Arrays.toString(lottoarr));
			
			
		}
		
		
		
		
		
		/*
		if (lottoarr[0] == lottoarr[1] || lottoarr[1] == lottoarr[2] || lottoarr[2] == lottoarr[3] || lottoarr[3] == lottoarr[4] || lottoarr[4] == lottoarr[5] || lottoarr[5] == lottoarr[6]) {
			for (int i = 0; i < lottoarr.length; i++) {
				lottoarr[i] = (int) (Math.random()*46+1);
		}//for
		}//if
		*/
		
		
		//System.out.printf("로또번호는 : %d, %d, %d, %d, %d, %d ", lottoarr[0],lottoarr[1],lottoarr[2],lottoarr[3],lottoarr[4],lottoarr[5] );
		/* 
		System.out.print("로또번호는 : ");
		for (int i = 0; i < 6; i++) {
			System.out.printf("%d ", lottoarr[i]);
		}
		System.out.printf("보너스 번호 : %d", lottoarr[6]);
		*/
	}//main

}//class


/*
4. Math.random() 메서드를 사용해서 
1) 임의의 국어점수(0~100)을 발생하는 코딩하기
2) 임의의 로또 번호(1~45)를 발생하는 코딩하기
*/