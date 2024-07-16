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
public class Ex07 {

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
		
		// Rock paper scissors 가위바위보 게임
		
		String [] rps = {"", "가위", "바위", "보"};
		

		
		System.out.printf("사용자 : %s, 컴퓨터 선택 : %s \n", rps[user], rps[com]);
		
		 switch (user - com) {
	      case 0:
	         // 무승부
	         System.out.println("무승부");
	         break;
	      case 1: case -2:
	         // 사람 승리
	         System.out.println("사용자 승리");
	         break;
	      default: //  2 , -1
	         // 컴퓨터 승리
	         System.out.println("컴퓨터 승리");
	         break;
	      }

		
		

	}//main

}//class








