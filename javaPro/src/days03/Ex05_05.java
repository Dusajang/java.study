package days03;

import java.util.Scanner;

/**
 * @author dkrkdfla
 * @date 2024. 7. 3. - 오후 4:30:31
 * @subject
 * @content
 *
 */
public class Ex05_05 {

	public static void main(String[] args) {
		/* 대입연산자 =
		int x = 100;
		int y = x;
		*/
		
		//부호연산자
		//+3   -3
		// int x = +3 + 4
		
		// 3*-1
		
		//[증감연산자] Ex05_06
		//[쉬프트연산자]
		//[복합대입연산자]
		//[삼항연산자 == 조건연산자] Ex05_08
		//[instanceof 비교연산자]
		
		// 우선순위 & > ^ > | > && >||
		
		//3 + 4 + 5 + 7
		
	
		
		/*
		//p.87
		int apple = 1;
		double pieceUnit = 0.1;
		int number = 7;
		//                        1 - 7 * 0.1
		double result = apple - number*pieceUnit;
		System.out.println("사과 1개에서 남은 양: " + result);
		*/
		
		//두 문자열을비교할 때는 ==        != 비교 연산자를 사용하지 말라.
		
		//                         equals()   !equals()
		
		
		 String n1 = "kenik", n2;

	      Scanner scanner = new Scanner(System.in);

	      System.out.print("> n2 입력 ? ");
	      n2 = scanner.next();

	      System.out.println( n1 == n2 );  // false
	      System.out.println( n1.equals(n2) ); // false
	      System.out.println( n1.equalsIgnoreCase(n2) ); // true
	/*
	      System.out.println( n1 != n2 );  // false
	      System.out.println( !n1.equals(n2) ); // true
	*/

	}

}
