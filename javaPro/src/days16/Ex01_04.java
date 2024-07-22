package days16;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author dkrkdfla
 * @date 2024. 7. 22.오전 9:33:44
 * @subject
 * @content
 *
 */
public class Ex01_04 {

	public static void main(String[] args) {
		int a = 0, b = 0;
		Scanner scanner = new Scanner(System.in);


		//다중 catch문 -> JDK 1.7 | 기호 (연산자x), 멀티 catch문
		try {
			System.out.print(">a, b 두 정수 입력");
			a = scanner.nextInt();
			b = scanner.nextInt();
			double c = a / b;
			System.out.printf("%d / %d = %.2f\n", a, b, c);
		} catch (InputMismatchException | ArithmeticException e) {
			System.out.println(e.toString());
		} catch (Exception e) {   
			e.printStackTrace();
		} finally {
			System.out.println();  // 없어도 되지만 DB처리할때나 파일 처리할 때 필요
		}
		// try catch



		//주의할 점 - 자식 catch블럭을 먼저 코딩한다
		try {
			double c = a / b;
			System.out.printf("%d / %d = %.2f\n", a, b, c);
		} catch (ArithmeticException e) {
			System.out.println(e.toString());
		} catch (Exception e) {   // catch문 여러 개 가능

		}




		System.out.println("  end  ");




	}//main

}//class





