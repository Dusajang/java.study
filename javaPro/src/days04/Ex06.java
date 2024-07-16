package days04;

/**
 * @author dkrkdfla
 * @date 2024. 7. 4. - 오후 12:30:50
 * @subject
 * @content
 *
 */
public class Ex06 {

	public static void main(String[] args) {
		//1) x는 10보다 크다.           							 x > 10
	      
	      // 2) x는 10보다 크고, 20보다 작다.     				 x > 10  &&  x < 20
	      
	      // 3) x는 2의 배수이다.            						 x%2 == 0 
	      
	      // 4) x는 2의 배수 또는 3의 배수이다. 				 x%2 == 0 || x%3 == 0
		
	      // 5) x는 2의 배수이지만 6의 배수는 아니다. 			 x%2 == 0   &&   x%6 !=0
		  //     =x는 2의 배수이고 6의 배수는 아니다.
	      
	      // 6) 한 문자(ch)가  숫자이다.               			 ch>=48  &&  ch<=59
		  //															'0'>=48  &&  ch<='9'
		
		
	      // 7) 한 문자(ch)가 소문자이다.               			 ch>=97  &&  ch<=122
		  //															'a'>=97  &&  ch<='z'
	      
	      // 8) 한 문자(ch)가 알파벳이다 ( 대문자이거나 또는 소문자  )  
		  //{ch >= 65(A)  &&  ch <= 90(Z)}  ||  {ch >= 97(a)  &&  ch <= 122(z)}
		  //{ch >= 'A'  &&  ch <= 'Z'}  ||  {ch >= 'a'  &&  ch <= 'z'}
		
		/*
		char ch = 'x';
		// 1. The left-hand side of an assignment must be a variable
		// 2. The operator <= is undefined for the argument type(s) boolean, int
		// -------------->
	    // System.out.println( 65 <= ch <= 122 );
		*/
		

	}//main

}//class
