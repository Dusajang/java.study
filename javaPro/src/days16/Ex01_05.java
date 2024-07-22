package days16;

import java.util.Scanner;

/**
 * @author dkrkdfla
 * @date 2024. 7. 22.오전 10:37:18
 * @subject
 * @content
 *
 */
public class Ex01_05 {

	public static void main(String[] args) {
		
		//Scanner scanner = new Scanner(System.in);
		//scanner.close();
		
		/*
		Scanner scanner = new Scanner(System.in);
		try {
			//
			//
		} catch (Exception e) {
			
		}finally {
			scanner.close();
		}
		*/
		
		
		//try~ resources문/ try 뒤에 (사용하는 자원)
		try (Scanner scanner = new Scanner(System.in);){   //자동으로 Scanner가 닫힘
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		

	}//main

}//class
