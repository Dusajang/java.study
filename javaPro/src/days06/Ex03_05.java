package days06;

import java.nio.channels.AcceptPendingException;
import java.util.Scanner;

public class Ex03_05 {

	public static void main(String[] args) {
		//정규표현식
		//[문제] 주민등록번호 14자리를 입력받아서...
		String[] rrnArr = {
				"123456-1234567"
				,"123456-123456"
				,"123456-12345678"
				,"12a456-123#567"
				,"1234561234567"
		};
		/*
		String regex = "\\d{6}-\\d{7}";
		
		for (int i = 0; i < rrnArr.length; i++) {
			System.out.printf("%s - %b\n", rrnArr[i], rrnArr[i].matches(regex));
		}
			*/	
		
		//[문제] 우편번호 000-000    00000
		String[] zipcodearr = {
				"123-456"
	            , "1234-123"
	            , "12345"
	            , "123a5"
		};
		System.out.println("=".repeat(30));
		
		String regex = "\\d{3}-\\d{3} | \\d{5}";
		
		for (int i = 0; i < zipcodearr.length; i++) {
			System.out.printf("%s - %b\n", zipcodearr[i], zipcodearr[i].matches(regex));
		}
		

	}//main

}//class
