package days07;

public class Ex02_04 {

	public static void main(String[] args) {
//		*			i=1		j=0		k=1
//		_*			i=2		j=1		k=1
//		__*		i=3		j=2		k=1
//		___*		i=4		j=3		k=1
//		____*	i=5		j=4		k=1
		
		
			for (int i = 1; i <= 5; i++) {
					for (int j = 1; j <= i-1; j++) {
						System.out.print("_"); 
					}
					for (int k =1; k <= i-(i-1); k++) {
						System.out.print("*");
					}
					System.out.println();
			}
					
//		____*	i=1		j=4		k=1
//		___*		i=2		j=3		k=1
//		__*		i=3		j=2		k=1
//		_*			i=4		j=1		k=1
//		*			i=5		j=0		k=1
					/*
				for (int i = 1; i <= 5; i++) {
						for (int j = 5; j <= i; j++) {
							System.out.print("_"); 
						}
						for (int k = 1; k <=5-i; k++) {
							System.out.print("*");
						}
						System.out.println();
			}//for
			*/
				
				
//		      *___*
//		      _*_*
//		      __*
//		      _*_*
//		      *___*
					/*
		      for (int i = 1; i <= 5 ; i++) { // 행갯수
		         for (int j = 1; j <= 5 ; j++) { // 열갯수
		            if( i==j || i+j==6 ) System.out.print("*");
		            else System.out.print("_");
		         }
		         System.out.println();
		      }
		      */

			
	}//main

}//class
