package days07;

/**
 * @author dkrkdfla
 * @date 2024. 7. 9. - 오전 10:36:25
 * @subject
 * @content
 *
 */
public class Ex02_02_02 {

	public static void main(String[] args) {
		/*
		****
		_***
		__**
		___*
		*/
			for (int i = 1; i <= 4; i++) {
					for (int j = 1; j <= i-1; j++) {
						System.out.print("_"); 
					}
					for (int k = 1; k <=5-i; k++) {
						System.out.print("*");
					}
					System.out.println();
				}
		
		
		
		/*
		___*		//1행 공백3개 별1개
		__**		//2행 공백2개 별2개
		_***		//3행 공백1개 별3개
		****		//4행 공백0개 별4개
		
			for (int i = 1; i <= 4; i++) {
					for (int j = 1; j <= 4-i; j++) {
						System.out.print("_"); 
					}
					for (int k = 1; k <= i; k++) {
						System.out.print("*");
					}
					System.out.println();
			}
		*/
	}

}
