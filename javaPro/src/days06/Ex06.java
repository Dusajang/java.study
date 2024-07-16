package days06;

/**
 * @author dkrkdfla
 * @date 2024. 7. 8. - 오후 3:11:34
 * @subject		[이름(Label)이 붙은 반복문]
 * @content		break 라벨명;
 * 						continue 라벨명;
 *
 */
public class Ex06 {

	public static void main(String[] args) {
		
		EXIT : for (int dan = 2; dan <= 9; dan++) {
			//System.out.printf("%d단\n", dan);
			for (int j = 1; j <=9; j++) {
				//if (j==5) break EXIT;
				if (j==5) continue EXIT;
				System.out.printf("%d*%d=%d\t", dan, j, dan*j);
			}
			System.out.println();
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






