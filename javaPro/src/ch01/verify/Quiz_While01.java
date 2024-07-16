package ch01.verify;

public class Quiz_While01 {

	public static void main(String[] args) {
		// [문제4] 1~10까지의 홀수의 합(while)
		int i =0;
		int oddtot = 0;
		while (i <=10) {
			
			if (i % 2 ==1) {
				oddtot += i;
			}//if
			i++;
		}//while
		
		
		
		System.out.printf("%d", oddtot);
		
	}//main

}//class
