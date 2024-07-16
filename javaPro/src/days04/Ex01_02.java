package days04;

import java.util.Scanner;

public class Ex01_02 {

	public static void main(String[] args) {
		//이름, 나이, 등급('A','B','C','D','F')을 입력받아서 출력
		  		/*[입력형식]
				  이름, 나이, 등급을 입력하세요 ? _ 

				  [출력형식]
				  이름="홍길동", 나이=23살, 등급='B' 
				  */
		
		//cast 연산자로 타입변환시 숫자타입끼리만, 클래스 간의 형변환
		
		String name;
		byte age;
		char grade;
		
		System.out.print("이름, 나이, 등급");
		
		Scanner sc = new Scanner(System.in);
		
		name = sc.next();
		age = sc.nextByte();
		grade = sc.next().charAt(0);
		
		sc.close();
		
		System.out.printf("이름=\"%s\", 나이=%d, 등급=\'%c\'", name, age, grade);

	}//main

}//class
