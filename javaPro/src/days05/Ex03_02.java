package days05;

import java.util.Scanner;

public class Ex03_02 {

	public static void main(String[] args) {
		//[문제1] 국어점수를 입력받아서 수/우/미/양/가 출력(if문)
		
		Scanner scanner = new Scanner(System.in);
		int kor;
		boolean flag = false;
		do {
			if (flag) {
				System.out.println("입력잘못!!1\n 다시");
			}
			flag = true;
			//alt + 방향키, 선택 블록 이동
			System.out.print("국어 점수 입력?");
			kor = scanner.nextInt();
			}while (!(kor >= 0 && kor <= 100));
			//} while ( kor<0 || kor>100 );
		
		//JDK 14    case 10, 9 , 8 , 7..으로 구분 가능
		//수우미양가
		char grade ;
		switch (kor/10) {
		case 10:
			grade = '수';
			//break;
		case 9:
			grade = '수';
			//break;
		case 8:
			grade = '우' ;
			//break;
		case 7:
			grade = '미';
			//break;
		case 6:
			grade = '양';
			//break;

		default:
			grade = '가';
			break;
		}//switch
		System.out.printf("%d : %c\n", kor, grade);
	}//main

}//class




