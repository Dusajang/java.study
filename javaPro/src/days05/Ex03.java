package days05;

import java.util.Scanner;

public class Ex03 {

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
		
		//입력한 값들은 항상 [유효성 검사]가 필요하다.
		//수우미양가 출력
		/*
		if (kor >=90 && kor <= 100) {System.out.println("수");}
		if (kor >=80 && kor < 90) {System.out.println("우");}
		if (kor >=70 && kor < 80) {System.out.println("미");}
		if (kor >=60 && kor < 70) {System.out.println("양");}
		if (kor >=0 && kor < 60) {System.out.println("가");}
		*/
		
		//한 줄 코딩일 때, 중괄호 생략하고 옆에 붙이기 가능
		if ( kor >=90 ) {System.out.println("수");}
		else if (kor >=80 ) {System.out.println("우");}
		else if (kor >=70 ) {System.out.println("미");}
		else if (kor >=60 ) {System.out.println("양");}
		else {System.out.println("가");}
		

	}//main

}//class




