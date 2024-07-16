package days03;

/**
 * @author dkrkdfla
 * @date 2024. 7. 3. - 오후 12:42:31
 * @subject   타입(형) 변환
 * @content   1) 자동 형 변환
 *                         - 더 큰 자료형 = 작은 자료형의 값
 *                         
 *                  2) 강제 형 변환
 *
 */
public class Ex03_03 {

	public static void main(String[] args) {
		
		int no = 15;
		System.out.printf("%d\n", no);
		System.out.printf("%4d\n", no);
		System.out.printf("%04d\n", no);           //flags 0 빈자리에 0으로 채우겠다
		System.out.printf("%-4d\n", no);
		System.out.println("-".repeat(20));
		
		
		String name = "홍길동";
		System.out.printf("[%s10]\n", name);
		System.out.printf("[%s-10]\n", name);
		// 3.14 => double
		//float pi = 3.14;
		//float pi = (float)3.14;
		float pi = 3.14f;
		
		
		int i = 100;   // [][][][]
		long l = i;     // [][][][][][][][]  1번째 경우
		
		// 자동 형 변환 2번째 경우
		long k =l + i; //큰 자료형 + 작은 자료형 => 큰 자료형
		
		
		//자동 형 변환 x
		//강제 형 변환  -  (변환하고자하는 타입) cast 연산자
		//cast 강제 형 변환
		i = (int) 100L;
		
		
		// 3 + 5 * 2 == 13
		//() 최우선 연산자
		//( 3 + 5 ) * 2 = 16

	}

}
