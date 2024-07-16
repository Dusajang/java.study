package days07;

/**
 * @author dkrkdfla
 * @date 2024. 7. 9. - 오전 10:36:25
 * @subject
 * @content
 *
 */
public class Ex02_02 {

	public static void main(String[] args) {
		
//		___*		//1행 공백3개 별1개
//		__**		//2행 공백2개 별2개
//		_***		//3행 공백1개 별3개
//		****		//4행 공백0개 별4개
		
		
		
		
		
		
		
		
//      ****   i=1  0   4
//      _***   i=2  1   3
//      __**   i=3  2   2
//      ___*   i=4  3   1
				for (int i = 1; i <= 4; i++) {
					for (int j = 1; j <= 4; j++) {
					System.out.print(i<=j ? "*" : "_" );
				}
					System.out.println();
			}
		
		
		

		
		
	}

}
