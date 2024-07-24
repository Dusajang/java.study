package days18;

import java.text.MessageFormat;

/**
 * @author dkrkdfla
 * @date 2024. 7. 24.오전 11:30:50
 * @subject             4. Message Format
 * @content
 *
 */
public class Ex02_04 {

	public static void main(String[] args) {
		// Message Format 형식화 클래스
		// 데이터 -> 특정형식으로 출력
		String name = "권맑음";
		int age = 26;
		boolean gender = true;
		double height = 178.67;
		char grade = 'A';

		String pattern = "이름 : {0}, 나이 : {1}, 성별 : {2}, 키 : {3}, 등급 : {4}입니다.";
		//MessageFormat mf = new MessageFormat(pattern );
		//String s = mf.format(pattern,  name, age, gender?"남자":"여자", height, grade );

		String s =  MessageFormat.format(pattern,  name, age, gender?"남자":"여자", height, grade );


	}//main

}//class
