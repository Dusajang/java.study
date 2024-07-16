package days02;

/**
 * @author dkrkdfla
 * @date 2024. 7. 2. - 오후 2:52:07
 * @subject   숫자(정수계열)
 * @content   byte(1), short(2), int(4), long(4)
 *
 */
public class Ex05_02 {

	public static void main(String[] args) {
		
		/*
		 * [진법]
		 * 1. 10진법  -   0 1 2 3 4 5 6 7 8 9
		 * 2. 2진법    - 0 1
		 * 3. 8진법    -  0 1 2 3 4 5 6 7
		 * 4. 16진법  -  0 1 2 3 4 5 6 7 8 9 a(10) b(11) c(12) d(13) e(14) f(15)
		 * 
		 * 0 1
		 * 1bit  [0] [1] 2가지
		 * 1byte == 8bit  [부호비트] [] [] [] [] [] [] []  2^7 == 128가지
		 *      -128 0 127
		 *      
		 * short(2byte)
		 * 2byte == [부호비트] [] [] [] [] [] [] [] [] [] [] [] [] [] []  2^15 == 32768 가지
		 *      -32768 0 32767
		 *      
		 * int (4byte) == 32bit   2^31 약 21억
		 * 
		 * long(8) == 2^63 가지 300경
		 * 
		 * 
		 */
		
		
		//사람의 나이를 저장할 변수 선언
        //byte age
		
		//국어점수를 저장할 변수 선언
		//byte koreanScore;
		
		//Type mismatch: cannot convert from double to float   자료형이 불일치
		//float f = 3.14f;
		//double d = 3.14;
		
		System.out.printf("%d %d %f %f\n", 100, 100L, 3.14f, 3.14D);
		
		
		
	}//main

}//class
