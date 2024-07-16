package days03;

/**
 * @author dkrkdfla
 * @date 2024. 7. 3. - 오후 3:54:51
 * @subject		논리연산자  
 * @content		참/거짓 
 * 						1)일반 논리 연산자  
 *						ㄱ.&& 일반논리 AND 연산자, 논리곱 연산자
 *							두 피연산자 모두 참일 때만 참이 된다.
 *							true && true => true
 *							true && false =>false
 *							false && true =>false
 *							false && false =>false
 *
 *						ㄴ.||(OR)
 *							둘 다 거짓이면 거짓, 하나라도 참이면 참
 *							true || true => true
 *							true || false =>true
 *							false || true =>true
 *							false || false =>false
 *
 *						ㄷ.!(NOT) 부정연산자 or not 연산자
 *							!참 -> 거짓
 *							!거짓 -> 참
 *
 *						2)비트 논리 연산자
 *						ㄱ. & 비트논리 AND 연산자
 *						ㄴ. | 비트논리 OR 연산자
 *						ㄷ. ^ XOR 연산자	== e[Xclusive] 배타적인
 *						ㄹ. ~ 틸드 연산자(비트부정연산자)
 *
 */
public class Ex05_04 {

	public static void main(String[] args) {
		System.out.println(10 & 3); // 2
		System.out.println(10 | 3); // 11
		System.out.println(10 ^ 3); // 9 XOR
		
		System.out.println( ~10 ); // -11
		// 0000 1010
		// 1111 0101
		// 1111 0100
		// 0000 1011
		// -11
		
		// 10            0000 1010
		//  3            0000 0011 ^
		//                0000 1001 
		//  3            0000 1011 &
		//                0000 0010 2
		
		
		/*
		//The operator ! is undefined for the argument type(s) int
		// >(비교)     우선순위가 높다.          !(논리)
		System.out.println(!3>5);
		
		
	
		// Dead code
		System.out.println( 3<5 && 100>1);
		// Dead code
		System.out.println( 3<5 || 100>1);
		*/
		

	}//main

}//class
