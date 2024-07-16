package days07;

/**
 * @author dkrkdfla
 * @date 2024. 7. 9. - 오후 3:47:55
 * @subject		메서드(함수) 사용 예제
 * @content		두 정수의 합을 구해서 출력
 * 						함수 선언 -1) 두 정수의 합 구하는 기능
 * 									2) 두 정수
 * 									3) 합
 *
 */
public class Ex06_02 {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		int c;
		
		c=hap(a,b);
		System.out.printf("%d+%d=%d", a, b, c);
		
		
		c=hap(1,2,3);
		

	}//main

	private static int hap(int i, int j, int k) {
		
		return i+j+k;
	}

	public static int hap(int a, int b) {
		//int result;
		//result = a+b;
		return a+b;
	}

}//class







