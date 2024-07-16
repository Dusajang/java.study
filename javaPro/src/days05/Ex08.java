package days05;

/**
 * @author dkrkdfla
 * @date 2024. 7. 5. - 오후 4:12:34
 * @subject
 * @content
 *
 */
public class Ex08 {

	public static void main(String[] args) {
		//[ASCII 모두 출력] + for문 사용
		/*
		for (int i = 0; i < 256; i++) {
			System.out.printf("%d[%c]\n", i, i);
		}
		*/
		
	
		//9    '\t'  tab
		//10  '\n'  LineFeed(LF)
		//13  '\r'  Carragereturn(CR)
		
		for (int i = 0, lineNumber = 1; i < 256; i++) {
			//if (i % 10 == 0)  {}System.out.printf("%d : ", i/10+1);
			if (i % 10 == 0)  System.out.printf("%d : ", lineNumber++);
			System.out.printf("[%c]", i);
			if (i % 10 == 9)  System.out.println(); //if

			
		}//for
		
	}//main

}//class
	
	
	
	
	
	
	
	
