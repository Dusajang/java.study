package days06;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author dkrkdfla
 * @date 2024. 7. 8. - 오전 10:24:02
 * @subject
 * @content
 *
 */
public class Ex02_02 {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		for (int i = 0, lineNumber = 1; i < 256; i++) {
	         if (i%10 == 0) System.out.printf("%d : ",lineNumber++);
	         System.out.printf("[%c]", i);
	         if (i%10 == 9) {
	        	 System.out.println();
	        	 
	        	 if ((lineNumber-1) % 10 == 0) {
	 				System.out.print("엔터를 입력해서 계속");
	 				System.in.read(); 
	 	            System.in.skip(System.in.available());
	        	 }
	         } 
	       
	      } // for

	}//main

}//class
