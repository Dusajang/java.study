package days07_Review;

public class Home_Review01 {

	public static void main(String[] args) {
//1. 이등변 삼각형 
//      __*							(1.3)
//      _*** 				(2.2)(2.3)(2.4)
//      *****		(3.1)(3.2)(3.3)(3.4)(3.5)
		
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print(i+j>=4 && j-i<=2? "*":"_");
			}
			System.out.println();
		}
		

	}//main

}//class
