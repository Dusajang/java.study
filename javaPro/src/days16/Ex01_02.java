package days16;

import java.util.Scanner;

/**
 * @author dkrkdfla
 * @date 2024. 7. 22.오전 9:33:44
 * @subject
 * @content
 *
 */
public class Ex01_02 {

	public static void main(String[] args) {
		int a = 0, b = 0;
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			
			try {
				System.out.print(">a, b 두 정수 입력");
				 a = scanner.nextInt();
				//InputMismatchException   a=>nextInt()
				b = scanner.nextInt();
				
				break;
			} catch (Exception e) {
				//예외가 발생한 순간 catch 문으로 이동
				//여기에 예외처리하는 코딩
				scanner.nextLine();
				System.out.println(">입력값 잘못 실패...");
				//e.printStackTrace();
				//System.out.println(e.getMessage());
				//System.out.println(e.toString());
				
			}// try catch
			
		}//while
		
		
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





