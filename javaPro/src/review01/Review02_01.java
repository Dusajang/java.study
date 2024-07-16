package review01;

import java.util.Scanner;

public class Review02_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String name;
		int age;
		
		System.out.print("이름?");
		name = sc.nextLine();
		
		System.out.print("나이?");
		age = sc.nextInt();
		
		sc.close();
		
		System.out.printf("이름 : %s, 나이 : %d", name, age);

	}

}
