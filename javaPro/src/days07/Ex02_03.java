package days07;

public class Ex02_03 {

	public static void main(String[] args) {
//		이등변삼각형
//		__*			1행 _2개 *1개
//		_***			2행 _1개 *3개
//		*****		3행         *5개
		
				for (int i = 1; i <= 3; i++) {
					for (int j = 1; j <=3-i; j++) {
						System.out.print("_"); 
					}
					for (int k = 1; k <=(2*i)-1; k++) {
						System.out.print("*");
					}
					System.out.println();
				}

	}//main

}//class
