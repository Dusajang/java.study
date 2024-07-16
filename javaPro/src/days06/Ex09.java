package days06;

/**
 * @author dkrkdfla
 * @date 2024. 7. 8. - 오후 5:08:17
 * @subject		별찍기
 * @content
 *
 */
public class Ex09 {

	public static void main(String[] args) {
		// ****
		// ****
		// ****
		// ****

		/*
		System.out.println("****");
		System.out.println("****");
		System.out.println("****");
		System.out.println("****");
		*/

		/*
		for (int i = 1; i <= 4 ; i++) {
			 System.out.println("****");
		}
		*/

		// i=1  j=1,2,3,4
		// i=2  j=1,2,3,4
		// i=3  j=1,2,3,4
		// i=4  j=1,2,3,4
		/*
		for (int i = 1; i <= 4 ; i++) {      // 행 갯수
			for (int j = 1; j <= 4 ; j++) {  // 열(별) 갯수
				System.out.print("*");
			}
		    System.out.println();
		}
		*/
		
		
		for (int i = 1; i <= 4 ;i++) {      // 행 갯수
			for (int j = 1; j <= 4 ; j++) {  // 열(별) 갯수
				System.out.print("*");
			}
		    System.out.println();
		}
		
		
	} // main

} // class




/*

*			//1행 1개
**			//2행 2개
***		//3행 3개
****		//4행 4개
	for (int i = 1; i <= 4 ;i++) {      // 행 갯수
			for (int j = 1; j <= i ; j++) {  // 열(별) 갯수
				System.out.print("*");
			}
		    System.out.println();
		}


****		//1행 4개
***		//1행 3개
**			//1행 2개
*			//1행 1개
	for (int i = 1; i <= 4 ;i++) {      // 행 갯수
			for (int j = 1; j <= 5-i ; j++) {  // 열(별) 갯수
				System.out.print("*");
			}
		    System.out.println();
		}

___*		//1행 공백3개 별1개
__**		//2행 공백2개 별2개
_***		//3행 공백1개 별3개
****		//4행 공백0개 별4개

****
_***
__**
___*

 이등변삼각형
__*
_***
*****

*
_*
__*
___*
____*

____*
___*
__*
_*
*

*___*
_*_*
__*
_*_*
*___*

마름모

__*
_***
*****
_***
__*

모래시계
 * */


