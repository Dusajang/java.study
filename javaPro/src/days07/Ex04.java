package days07;

/**
 * @author dkrkdfla
 * @date 2024. 7. 9. - 오후 2:01:45
 * @subject
 * @content
 *
 */
public class Ex04 {

	public static void main(String[] args) {
		//[정보처리 기사 실기]
		//1+1+2+3+5+8+13+21+34...
		//4.풀이
		int firstTerm = 1;
		int secondTerm = 1;
		int nextTerm;
		int sum = firstTerm + secondTerm;
		System.out.printf("%d+%d+", firstTerm, secondTerm );
		
		//nextTerm = firstTerm + secondTerm;
		while ((nextTerm = firstTerm + secondTerm)<=100) {
			System.out.printf("%d+", nextTerm);
	         sum += nextTerm;
	         firstTerm = secondTerm;
	         secondTerm = nextTerm;
	        // nextTerm = firstTerm + secondTerm;
		}
		System.out.printf("=%d", sum);
		
		
		/*3풀이
		 * int firstTerm = 1;
		int secondTerm = 1;
		int nextTerm;
		int sum = firstTerm + secondTerm;
		System.out.printf("%d+%d+", firstTerm, secondTerm );
		
		while (true) {
			nextTerm = firstTerm + secondTerm;
			if (nextTerm >100) break;
			System.out.printf("%d+", nextTerm);
	         sum += nextTerm;

	         firstTerm = secondTerm;
	         secondTerm = nextTerm;
		}
		 */
		
		/*2풀이
		 * int firstTerm = 1;
		int secondTerm = 1;
		int nextTerm;
		int sum = firstTerm + secondTerm;
		System.out.printf("%d+%d+", firstTerm, secondTerm );
		
		nextTerm = firstTerm + secondTerm;
		while (nextTerm<=100) {
			if (nextTerm >100) break;
			System.out.printf("%d+", nextTerm);
	         sum += nextTerm;

	         firstTerm = secondTerm;
	         secondTerm = nextTerm;
	         nextTerm = firstTerm + secondTerm;
		}
		System.out.printf("=%d", sum);
		*/
		 
		
	}//main

}//class
