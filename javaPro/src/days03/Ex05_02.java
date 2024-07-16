package days03;

/**
 * @author dkrkdfla
 * @date 2024. 7. 3. - 오후 3:32:54
 * @subject    산술연산자 설명.
 * @content    + - * / %나머지(remainder) 연산자
 *
 */
public class Ex05_02 {

	public static void main(String[] args) {
		int i =10, j = 3;
		//주의할 점
		//1. 정수 / 0
		// java.lang.ArithmeticException 산술적 예외가 발생했다.
		//  / by zero
		//System.out.println(10 / 0);
		
		//2. 실수 / 0     Infinity - 리터럴값
		//System.out.println(10.0 / 0);
		//System.out.println( Double.isInfinite( 10.0 / 0 ));           //is는 물어보는 것
		
		//실수 % 0      NaN == Not a Number  리터럴값
		System.out.println(10.0 % 0);
		System.out.println(Double.isNaN( 10.0 % 0));
		
		
		/*
		System.out.println(i + j);  //13
		System.out.println(i - j);  //7
		System.out.println(i * j);  //30
		//몫 연산자
		System.out.println(i / j);  //3
		//나머지 연산자
		System.out.println(i % j);  //1
		
		System.out.println((double)i / j);  //3.33333
        */
	}

}
