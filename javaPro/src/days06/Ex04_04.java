package days06;

import java.util.Random;

public class Ex04_04 {

	public static void main(String[] args) {
		//chapter 16. 람다식
		//chapter 17. 스트림 요소 처리
		
		//아래 한 줄 암기
		//int[] m = new Random().ints(1, 101).limit(10).toArray();
		
		//				IntStream										OptionalInt
		int max = new Random().ints(1, 101).limit(10).max().getAsInt();
		System.out.println(max);
		
		
		
		
		/*
		//java.util.Random 클래스
		Random rnd = new Random();
		//rnd.nextInt(Int Bound);
		int kor = rnd.nextInt(101);
		int lotto = rnd.nextInt(45)+1;
		//rnd.nextBoolean()  true. flase;
		//rnd.nextInt  -21억~21억
		//rnd.nextLong  -900경~900경
		 
		 */

		
	}//main

}//class






