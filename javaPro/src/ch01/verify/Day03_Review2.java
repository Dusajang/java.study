package ch01.verify;

import java.util.Scanner;

public class Day03_Review2 {

	public static void main(String[] args) {
		//Scanner 를 사용해서 이름, 나이 입력받아서 출력.
		
		String name;
		int age;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름?");
		name = sc.nextLine();
		
		System.out.print("나이?");
		age = sc.nextInt();
		
		sc.close();
		
		System.out.printf("이름 : %s, 나이 : %d", name, age);
		
	}

}
