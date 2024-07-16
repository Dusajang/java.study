package days06_Review;

public class Home_Review05 {

	public static void main(String[] args) {
		//__*
		//_***
		//*****
		//_***  공백1 *3개
		//__*	공백2 *1개
		for (int i = 0; i < 3; i++) {
			for (int j = 2; j > i; j--) {
				System.out.print("_"); 
			}
			for (int k = 1; k <=(2*i)+1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}//바깥 for문1
		for (int i =1; i >= 0; i--) {
			for (int j = 2; j > i; j--) {
				System.out.print("_"); 
			}
			for (int k = 1; k <=(2*i)+1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}//main

}//class


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
	for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 4-i; j++) {
				System.out.print("_"); 
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

****
_***
__**
___*
	for (int i = 0; i < 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("_"); 
			}
			for (int k = 1; k <=4-i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

 이등변삼각형
__*			1행 _2개 *1개
_***		2행 _1개 *3개
*****		3행         *5개
		for (int i = 0; i < 3; i++) {
			for (int j = 2; j > i; j--) {
				System.out.print("_"); 
			}
			for (int k = 1; k <=(2*i)+1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

*
_*
__*
___*
____*
	for (int i = 0; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("_"); 
			}
			//for (int k = 1; k <=4-i; k++) {
				System.out.print("*");
			//}
			System.out.println();
		}

____*
___*
__*
_*
*
	for (int i = 0; i <= 5; i++) {
			for (int j = 5; j > i; j--) {
				System.out.print("_"); 
			}
			//for (int k = 1; k <=4-i; k++) {
				System.out.print("*");
			//}
			System.out.println();
		}

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
		for (int i = 0; i < 3; i++) {
			for (int j = 2; j > i; j--) {
				System.out.print("_"); 
			}
			for (int k = 1; k <=(2*i)+1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}//바깥 for문1
		for (int i =1; i >= 0; i--) {
			for (int j = 2; j > i; j--) {
				System.out.print("_"); 
			}
			for (int k = 1; k <=(2*i)+1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

모래시계
  */