package days04;

/**
 * @author dkrkdfla
 * @date 2024. 7. 4. - 오후 3:28:47
 * @subject
 * @content
 *
 */
public class Ex09 {

	public static void main(String[] args) {
		
		// [break 문]
		/*
		for (int i = 1; i <= 10; i++) {
			//실행문 1줄(행) {}생략가능, 옆에 코딩 가능
			if (i==6) break;
			System.out.printf("%d+", i);
			
		}//for  */
		
	
	
		int i =1;
		while (i <= 10) {
			System.out.println(i);
			i++;
			if (i==6) break;
		}//while
		
		
		
	}//main

}//class





