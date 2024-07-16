package review01;

public class Review_Days04_02 {

	public static void main(String[] args) {
		// 1. 1~10 까지 합 출력 ( for문, while문 각각) 
		
		int sum = 0;
		int i = 0;
		while (i <= 10) {
			sum += i;
			i++;
		}//while
		
		System.out.printf("%d", sum);
		
	}//main

}//class
