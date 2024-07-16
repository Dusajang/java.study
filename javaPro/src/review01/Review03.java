package review01;

public class Review03 {

	public static void main(String[] args) {
		
		int i = 10;
		
		System.out.println(Integer.toBinaryString( i ));  // 10진수를 2진수로 변환
		System.out.println(Integer.toOctalString( i ));   // 10진수를 8진수로 변환
		System.out.println(Integer.toHexString( i ));     // 10진수를 16진수로 변환
		
		System.out.printf("%d\n", i );                          // 10진수 정수 출력
		System.out.printf("%#o\n", i );                       // 앞에 0이 붙는 8진수 형식으로 출력
		System.out.printf("%#x\n", i );                       // 앞에 0x가 붙는 16진수 형식으로 출력
		
		/*
		 * - Integer.MAX_VALUE  - int 의 wrapper 클래스, 정수의 최댓값 출력
			- Integer.parseInt()     - String 타입의 숫자를 ,int 타입으로 변환
		 */
		

	}

}
