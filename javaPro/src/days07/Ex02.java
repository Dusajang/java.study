package days07;

/**
 * @author dkrkdfla
 * @date 2024. 7. 9. - 오전 10:00:33
 * @subject
 * @content
 *
 */
public class Ex02 {

	public static void main(String[] args) {
		/*
		****		//1행 4개
		***		//2행 3개
		**			//3행 2개
		*			//4행 1개
		*/
			for (int i = 1; i >= 4 ;i--) {      // 행 갯수
					for (int j = 1; j <= i ; j++) {  // 열(별) 갯수
						System.out.print("*");
					}
				    System.out.println();
				}

	}//main

}//class
