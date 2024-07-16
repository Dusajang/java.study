package days07_Review;

import java.util.Arrays;

public class Home_Review02 {

	public static void main(String[] args) {
		//2. 피보나치 수열
		// 1 	 1	  2	3	5	8	13	21	34...
	    //[0][1][2][3][4][5][6]   [7]    [8]
		
		//[2] = [1]+[0]
		//[3] = [2]+[1]
		//[4] = [3]+[2]
		//:
		//[i] = [i-1]+[i-2]
		
		//피보나치 수열 20번째 항까지의 합
		int n = 20;
		int [] f = new int [n];
		
		f[0] = 1;
		f[1] = 1;
		
		
		
			

	}//main

}//class


/*
 * int sum=0;
		int n = 20;
		int [] f =new int[n] ;
		
		  if (n > 0) f[0] = 1;
	      if (n > 1) f[1] = 1;
	        
		for (int i = 2; i < f.length; i++) {
			f[i] = f[i-1]+f[i-2];
			sum +=f[i];
			System.out.printf("%d+", f[i]);
		}
		//System.out.println(Arrays.toString(f));
		System.out.printf("=%d\n", sum);
		*/



