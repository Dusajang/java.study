package days06;

import java.util.Scanner;

/**
 * @author dkrkdfla
 * @date 2024. 7. 8. - 오전 10:44:42
 * @subject
 * @content1. 
 *     1.한 문자를 입력받아서 
		한글입니다.
		알파벳대문자입니다.
		알파벳소문자입니다.
		숫자입니다.
		특수문자입니다.
		라고 출력하기
		( 특수문자는 #$!%@)
 *
 */
public class Ex03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char one;
		System.out.print("한 문자 입력");
		one = scanner.next().charAt(0);
		
		if (one>='가' && one <= '힣') {
			System.out.print("한글");
		}else if (one>='A' && one <= 'Z') {
			System.out.print("알파벳대문자");
		}else if (one>='a' && one <= 'z') {
			System.out.print("알파벳소문자");
		}else if (one>='0' && one <= '9') {
			System.out.print("숫자");
		}else if (one=='#' || one=='$' || one=='!' || one=='%' || one=='@') {
			System.out.print("특수문자");
			}else {
				System.out.println("알 수 없는 문자");
			}
		

	}//main

}//class





