package days05;

import java.util.Scanner;

/**
 * @author dkrkdfla
 * @date 2024. 7. 5. - 오후 2:51:11
 * @subject  컴퓨터 - 사용자(USER)
 * @content  [ 가위(1), 바위(2), 보(3) 게임 ]
 *          		컴퓨터는 게임을 할 때마다 임의의 수(1~3) 발생
 *           		사용자는 1~3  입력.
 *           
 *           		0~100점수
 *           		1~45 로또번호
 */
public class Ex07_02 {

	public static void main(String[] args) {
		int com, user;
		
		//    0.0    <=   double Math.random()   <    1.0
		//    0.0x3    <=   double Math.random()x3   <    1.0x3
		//    0.0    <=   double Math.random()x3   <    3.0
		//    0    <=   (int) (Math.random())x3   <    3
		//    0+1    <=   (int) (Math.random()x3)+1   <    3+1
		//    1    <=   (int) (Math.random()*3)+1   <    4	
		
		
		Scanner scanner = new Scanner(System.in);
		//컴퓨터 선택
		com = (int) (Math.random()*3)+1;
		//사용자 선택
		System.out.print("> user 가위(1),바위(2),보(3) 선택 ? ");
		user = scanner.nextInt();
		
		String strUser = "가위";
		
		
		System.out.printf("사용자 : %d, 컴퓨터 선택 : %d \n", user, com);
		
		/*
		if (user - com ==0) {
			System.out.println("무승부");
		}
		if (user - com == 1 || user - com == -2) {
			System.out.println("사용자 승리");
		}
		if (user - com == -1 || user - com == 2) {
			System.out.println("컴퓨터 승리");
		}
		*/
		
		int 판단 = user - com;
		if (판단 == 0) {
			System.out.println("무승부");
		} else if (판단 == 1 || 판단 == -2) {
			System.out.println("사용자 승리");
		} else {
			System.out.println("컴퓨터 승리");
		}{

		}
		
		

	}//main

}//class








