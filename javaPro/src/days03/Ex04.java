package days03;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		//tab 들여쓰기
		//shift + tab 내어쓰기
		//ctrl + a 전체선택
		//ctrl + i

		//.useDelimiter 구분자
		// \s는 스페이스를 의미, \\가 \로 인식, * 있어도 그만 없어도 그만
	     String input = "1 fish 2 fish red fish blue fish";
	     Scanner s = new Scanner(input).useDelimiter("\\s*fish\\s*"); 
	     
	     System.out.println(s.nextInt());
	     System.out.println(s.nextInt());
	     
	     System.out.println(s.next());
	     System.out.println(s.next());
	     
	     s.close();

	}//main

}//class
