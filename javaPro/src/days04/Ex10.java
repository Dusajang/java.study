package days04;

/**
 * @author dkrkdfla
 * @date 2024. 7. 4. - 오후 3:40:01
 * @subject
 * @content
 *
 */
public class Ex10 {

	public static void main(String[] args) {
		/*
		//for
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			System.out.printf("%d+", i);
			sum += i; //sum = sum + i;
			
		}//for
		System.out.printf("=%d\n", sum);
		*/
		
		
		//While문
		int i =1;
		int sum = 0;
		while (i <= 10) {
			System.out.printf("%d+", i);
			sum += i;
			++i;
			
		}
		System.out.printf("=%d", sum );
		
		
	}//main

}//class






