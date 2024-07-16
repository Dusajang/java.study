package week01;

import java.util.Iterator;

public class Review02 {

	public static void main(String[] args) {
		String str = "hello world!";
		 int size = str.length();
		 
		 char[] strarr = new char[size];
		 
		 for (int i = 0; i < strarr.length; i++) {
			strarr[i] = str.charAt(i);
		}
		
		 String target = "";
		 for (int i = 0; i < strarr.length; i++) {
			target += strarr[i];
		}
		
		 System.out.print(target);
		 
	}//main

}//class


/*
2. String str = "hello world!"
문자열을 char[] 로 변환하기
char []을 다시 String으로 변환하는 코딩하기
*/