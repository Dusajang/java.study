package days03;

public class Ex03 {

	public static void main(String[] args) {
		
		int i = 10;
		
		System.out.println( Integer.toBinaryString(i));  //"1010" 2진수
		System.out.println( Integer.toOctalString(i));  // "12" 8진수
		System.out.println( Integer.toHexString(i));  //"a" 16진수
		
		/*
		//10진수, 8진수, 16진수 값으로 출력.
		System.out.printf("%d \n", i);
		System.out.printf("%#o \n", i);
		System.out.printf("%#x \n", i);  //# 8진수 16진수 표현->flags에 해당
		
		int money = 23535790;
		System.out.printf("%,d \n", money); // flag ',' -> 3자리마다 ','
        */
		
		
	}//main

}//class
