package days08_Review;

import java.util.Scanner;

public class Home_Review02 {

	public static void main(String[] args) {
//		2. 금액을 입력받아서 화폐단위 별 갯수 출력  50000원, 10000원, 5000원, 1000원, 500원, 100원, 50원, 10원
		System.out.println("금액을 입력하세요.");
		Scanner scanner = new Scanner(System.in);
		int money = scanner.nextInt();
		//int money = 178620;
		int count; //몫
		int rest; // 나머지
		int[] unit = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
		
		for (int i = 0; i < unit.length; i++) {
			count = money / unit[i];
			rest = money % unit[i];
			money = rest;
			System.out.printf("%d원\t %d개\t %d\n", unit[i], count, rest);
		}

	}//main

}//class
