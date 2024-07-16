package days06;

import java.util.Scanner;

public class Ex03_02 {

	public static void main(String[] args) {
		//if ( one == '#' || one == '@' || one == '$' || one == '!' ) {}
		
		//정규 표현식(regexp) 유효성 검사. regular expression
		// boolean String.matches(String regexp);
		Scanner scanner = new Scanner(System.in);
		char one;
		String strOne;
		System.out.print("한 문자 입력");
		strOne = scanner.next();
		
		//String regex = "[#$%@!&]";
		//String regex = "[0123456789]";
		//String regex = "[0-9]";  \d
		//String regex = "[A-Z]";
		//String regex = "[A-Za-z]";
		//String regex = "[가-힣]";
		String regex = "[aeiouAEIOU]";
		System.out.println(strOne.matches(regex));
		

	}//main

}//class






