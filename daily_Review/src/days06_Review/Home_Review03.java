package days06_Review;

public class Home_Review03 {

	public static void main(String[] args) {
		EXIT:for (int dan = 2; dan <= 9 ; dan++) { 
			   for (int i = 1; i <= 9 ; i++) {
			      // if( i == 5) break EXIT;
			       if( i == 5) continue EXIT;
			      System.out.printf("%d*%d=%d\t", dan, i, dan * i);
			   }
			   System.out.println();
			 }

	}//main

}//class
