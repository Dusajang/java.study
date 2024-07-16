package ch01.verify;

public class Quiz_for01 {

	public static void main(String[] args) {
		// [문제3] 1~10까지의 홀수의 합(for)
		int oddtot = 0;
		
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 1 || i % 2 !=0) {
				oddtot+=i;
			}
			
			
		}//for
		
		System.out.printf("%d", oddtot);
		
	}

}
