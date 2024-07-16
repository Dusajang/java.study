package week02;

import java.util.Arrays;

public class dfg {

	public static void main(String[] args) {
		
		int tots[][] = {
									{100,65,72,92,23},
									{55,81,34,10,87}
				
							};
		
		int ranks[] = new int[10];
		int allRanks[][] = new int[2][5];
		
		for (int i = 0; i < tots.length; i++) {
			for (int j = 0; j < tots[i].length; j++) {
				ranks[(i*5)+j] = tots[i][j];
			}
		}
		for (int i = 0; i < ranks.length; i++) {
			for (int j = 0; j <= i; j++) {
				if (ranks[i] <= ranks[j]) {
					ranks[i]++;
				}
				if (ranks[i] > ranks[j]) {
					ranks[j]++;
				}
			}
			
		}
		
		System.out.println(Arrays.toString(ranks));
		
		
	}//main

}//class
