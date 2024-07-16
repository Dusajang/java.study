package days03;

/**
 * @author dkrkdfla
 * @date 2024. 7. 3. - 오전 10:30:26
 * @subject
 * @content
 *
 */
public class Ex01 {
	public static void main(String[] args) {
		//정수 : byte, short, int, long
		//             0    0L
		//논리형 : boolean
		//문자 : char
		//실수형 : float(4), [double(8)]
		//             3.14F     3.14D
		
		
		//char
		//2바이트
		//short
		//2바이트
		//int
		//4바이트 [s부호비트] [] [] []
		//float
		//                 1      [E]xponent 지수 - 제곱 수
		//                                 [M]antissa 가수 - 소수점자리
		//4바이트 [s부호비트] [E8] [M23비트]
		//double
		//8바이트  [1] [E11] [M52비트]
		//+-M x 10^E
		
		//정규화 작업
		//9.1234567 실수
        //1001.000111111001101011011011.....(무한실수)		
		//1001.000111111001101011011011.....x2^3(무한실수)		
		
	}//main

}//class
