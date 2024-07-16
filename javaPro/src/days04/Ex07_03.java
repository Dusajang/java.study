package days04;

/**
 * @author dkrkdfla
 * @date 2024. 7. 4. - 오후 2:22:42
 * @subject		제어문
 * @content		1) 조건문 : if문
 * 						***2) 분기문 : switch문
 * 						3) 반복문 : for문, foreach문
 * 						4) 조건반복문 : while문, do~while문
 * 						5) 기타 : break문, contine문
 *
 */
public class Ex07_03 {

	public static void main(String[] args) {
		int n = 10;
		String result = null;
		
		switch (n % 2) {
		case 0:
			//System.out.println("짝수(even number)");
			result = "짝수(even number)";
			break;

		case 1:   //필수 아님
			//System.out.println("홀수(odd number)");
			result = "홀수(odd number)";
		default :
			break;
		}
		
		System.out.println(result);
		
		
		
		
		
		
		if (n % 2 == 0) {
			System.out.println("짝수(even number)");
		}//if
		
		if (n % 2 != 0) {
			System.out.println("홀수(odd number)");
		}//if
		

	}//main

}//class
