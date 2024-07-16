package days07;

public class Ex02_03_02 {

	public static void main(String[] args) {
//		이등변삼각형
//		__*			1행 _2개 *1개
//		_***			2행 _1개 *3개
//		*****		3행         *5개
		
				for (int i = 1; i <= 3; i++) {
					for (int j = 1; j <= 5; j++) {
						//System.out.print(i+j>4 ? "*" : "_");
						//System.out.print(j-i<=2 ? "*" : "_");
						System.out.print(i+j>=4 && j-i<=2 ? "*" : "_");
					}
					System.out.println();
				}

	}//main

}//class
