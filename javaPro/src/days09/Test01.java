package days09;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		//1. 머니(money)를 입력받아서 각 화폐단위의 갯수를 출력하는 코딩을 하세요.
		System.out.println("money를 입력하세요.");
		Scanner scanner = new Scanner(System.in);
		int money = scanner.nextInt();
		int count;
		int rest;
		int[] unit = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
		 for (int i = 0; i < unit.length; i++) {
			count = money/unit[i];
			rest = money%unit[i];
			money = rest;
			System.out.printf("%d원 : %d개, 잔돈 : %d\n", unit[i], count, rest);
		}
		 
		 
	}//main

}//class




