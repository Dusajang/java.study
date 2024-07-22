package days16;

import java.util.Arrays;

/**
 * @author dkrkdfla
 * @date 2024. 7. 22.오후 2:22:49
 * @subject       [문자열 다루는 클래스]
 * @content       1. String
 *                      2. StringBuffer
 *                      3. StringBuilder
 *                      4. StringTokenizer
 *
 */
public class Ex05 {

	public static void main(String[] args) {
		String name = "홍길동";
		name += "님";                         // +  문자열 연결 연산자
		name += "안녕!!!";                    // +
		
		//String => 클래스
		String name2 = new String("홍길동");
		
		//두 문자열 비교는 equals(), equalsIgnoreCase()
		
		System.out.println(name.length());
		System.out.println(name.charAt(0));
		System.out.println(name.substring(1, 3));
		System.out.println(name.trim()); //앞 뒤 공백 제거
		//System.out.println(name.split(regex));
		System.out.println("=".repeat(10));
		System.out.println("aBcD".toUpperCase());
		System.out.println("aBcD".toLowerCase());
		char[] nameArr = name.toCharArray();
		System.out.println(Arrays.toString(nameArr));
		//클래스 메서드 (정적, static)
		String msg = String.format("%s님 %d살", "홍길동", 20);
		System.out.println(msg);
		
		//String -> Instream
		//name.chars()
		
		// 두 문자열 비교 : equals()       true/false
		// 0 또는 -음수값 또는 양수값을 리턴
		System.out.println("aBc".compareTo("abc"));
		
		//name 문자열 속에 "길동"이라는 문자열 포함 유무 체크
		System.out.println(name.contains("길동"));
		System.out.println(name.contains("세호"));   //false
		
		//"홍길동님 안녕!!!"
		System.out.println(name.indexOf("길동"));  // 몇 번째에 있는지
		System.out.println(name.indexOf("시훈"));  // 없으면 -1
		
		System.out.println(name.lastIndexOf("길동"));  // 뒤에서부터 찾음, 인덱스 값은 indexOf와 같다.
		

	}//main

}//class











