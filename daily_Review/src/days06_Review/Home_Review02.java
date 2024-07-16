package days06_Review;

public class Home_Review02 {

	public static void main(String[] args) {
		//2. 구구단 (2단~9단) 가로, 세로 출력
		
		for (int i = 1; i <= 9; i++) {															//i = 1단, 2단, 3단 .... 9단
			for (int j = 2; j <= 9; j++) {													//j = 몇 번째인지
				System.out.printf("%dx%d=%d\t", j, i, i*j);
				
				if (j==9) System.out.println();
				}
			}

	}//main

}//class






