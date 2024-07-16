package week01;

public class Review08 {

	public static void main(String[] args) {
		//8. 구구단(2단~9단)까지 출력하는 것을 검색해서 공부하기.
		
		for (int i = 2; i <= 9; i++) {
			System.out.printf("%d단\n", i);
			for (int j = 1; j <=9; j++) {
				System.out.printf("%d x %d = %d\n", i, j, i*j);
			}
		}
		

	}//main

}//class




/*
int dan = 2;
for (int i = 1; i <= 9 ; i++) {
   System.out.printf("%d*%d=%d\n", dan, i, dan * i);
}
dan = 3;
for (int i = 1; i <= 9 ; i++) {
   System.out.printf("%d*%d=%d\n", dan, i, dan * i);
}
dan = 4;
for (int i = 1; i <= 9 ; i++) {
   System.out.printf("%d*%d=%d\n", dan, i, dan * i);
}
:
dan = 9;
for (int i = 1; i <= 9 ; i++) {
   System.out.printf("%d*%d=%d\n", dan, i, dan * i);
}
*/
