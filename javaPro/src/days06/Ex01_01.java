package days06;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author dkrkdfla
 * @date 2024. 7. 8. - 오전 9:52:28
 * @subject
 * @content
 *
 */
public class Ex01_01 {

	public static void main(String[] args) throws IOException {
		//한 문자를 입력받아서 출력
		//BufferedReader, Scanner 클래스 "A" -> chatAt() -> 'A'
		//System.in
		char one;
		System.out.print(">한 문자 입력?");
		int nextbyte = System.in.read();
		System.out.println(nextbyte);
		//one = (char) System.in.read();
		//System.out.println(one);
		
		/*
		System.in.read();
		System.in.read();
		*/
		System.in.skip(  System.in.available()  );
		
		//복사 + 붙이기
		System.out.print(">한 문자 입력?");
		//one = (char) System.in.read();
		//System.out.println(one);
		one = (char) System.in.read();
		System.out.println(one);
		
		
		//스트림

	}//main

}//class





