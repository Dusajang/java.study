package week01;

import java.util.Scanner;

public class Review01 {

	public static void main(String[] args) {
		/*
		1. 한 문자를 입력받아서 
		한글입니다.
		알파벳대문자입니다.
		알파벳소문자입니다.
		숫자입니다.
		특수문자입니다.
		라고 출력하기
		( 특수문자는 #$!%@)
		*/
		
		Scanner scanner = new Scanner(System.in);
		
		String input;
		
		do {
			System.out.print("한 글자를 입력하세요.");
			input = scanner.nextLine();
		} while (input.length() != 1);
		
		if (input.length() == 1) {
			char c = input.charAt(0);
					if (c>='가' && c <= '힣') {
						System.out.print("한글입니다.");
					}else if (c>='A' && c <= 'Z') {
						System.out.print("알파벳대문자입니다.");
					}else if (c>='a' && c <= 'z') {
						System.out.print("알파벳소문자입니다.");
					}else if (c>='0' && c <= '9') {
						System.out.print("숫자입니다.");
					}else System.out.print("특수문자입니다");
		}
		
	}//main

}//class



/*
1. 한 문자를 입력받아서 
한글입니다.
알파벳대문자입니다.
알파벳소문자입니다.
숫자입니다.
특수문자입니다.
라고 출력하기
( 특수문자는 #$!%@)
*/