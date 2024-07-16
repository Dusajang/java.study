package days08;

import java.util.stream.IntStream;

public class Test01 {

	public static void main(String[] args) {
//		1. 피보나치 수열 
//		   10개의 항의 값의 합을 출력.
//		   1+1+2+3+5+8+13+21+34+55=??
		/*
		int hang1 = 1;
		int hang2 = 1;
		int hang3;
		int sum = hang1+hang2;
		System.out.printf("%d+%d+", hang1, hang2);
		
		while ((hang3 = hang1+hang2) <= 55) {
			System.out.printf("%d+", hang3);
			sum += hang3;
			hang1 = hang2;
			hang2 = hang3;
		}
		System.out.printf("=%d", sum);
		*/
		
//		3. 가변인자를 사용하여 정수의 합을 구하는 myHap() 메서드를 
//		  선언하세요. 
		int a;
		int b;
		int c;
		
		myHap();

	}
	
	public static int myHap(int ...numbers) {
		return IntStream.of().sum();
		}
	
}













