package review01;

import java.util.Scanner;

public class Review02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String name;
		int age;
		
		System.out.print("이름?");
		name = scanner.nextLine();
		
		System.out.print("나이?");
		age = scanner.nextInt();
		
		scanner.close();
		
		System.out.printf("이름 : %s, 나이 : %d", name, age);

	}

}
