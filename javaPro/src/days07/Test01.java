package days07;

/**
 * @author dkrkdfla
 * @date 2024. 7. 9. - 오전 8:54:13
 * @subject
 * @content
 *
 */
public class Test01 {

	public static void main(String[] args) {
		//2. 1/2-2/3+3/4-...7/8-8/9=???
		  // 분자/분모
	      // 분자/(분자+1)

	      // i  홀수-  sum +=
	      // i  짝수+  sum -=
	      boolean flag = true;
	      double sum = 0;

	      for (int i = 1; i <= 8  ; i++) {
	         if (flag) {
	            System.out.printf("%d/%d-", i, i+1);
	            sum += (double)i/(i+1);
	            //flag = false;
	         } else {
	            System.out.printf("%d/%d+", i, i+1);
	            sum -= (double)i/(i+1);
	            //flag = true;
	         } // if
	         flag = !flag;

	      } // for i

	      System.out.printf("=%f\n", sum);
		
	}//main

}//class


/*
//1. 구구단(2단~9단) 세로 출력
		//가로 출력
		for (int dan = 2; dan <= 9; dan++) {
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%dx%d = %d\t", dan, j, dan*j);
			}
			System.out.println();
		}
		System.out.println();
		//세로 출력
		for (int dan = 1; dan <= 9; dan++) {
			for (int j = 2; j <= 9; j++) {
				System.out.printf("%dx%d = %d\t", j, dan, dan*j);
			}
			System.out.println();
		}
*/