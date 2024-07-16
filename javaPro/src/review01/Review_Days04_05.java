package review01;

public class Review_Days04_05 {
	
	public static void main(String[] args) {
	    //3. 입력값을 split() 해서 처리하는 문제
		String string = "1234 5678 91011 12131415 16171819 ";
		
		String[] str = string.split(" ");
		
		String num1 = str[0];
		String num2 = str[1];
		String num3 = str[2];
		String num4 = str[3];
		String num5 = str[4];
			
		System.out.printf("%s\n", num1);
		System.out.printf("%s\n", num2);
		System.out.printf("%s\n", num3);
		System.out.printf("%s\n", num4);
		System.out.printf("%s\n", num5);
			
	}//main

}//class





