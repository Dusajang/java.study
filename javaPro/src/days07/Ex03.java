package days07;

import java.util.Arrays;
import java.util.Random;

/**
 * @author dkrkdfla
 * @date 2024. 7. 9. - 오후 12:07:56
 * @subject		제어문 + 배열 활용
 * @content
 *
 */
public class Ex03 {

	public static void main(String[] args) {
		//신용카드
		String card = "7655-8988-9234-5677";
		String regex = "-";
		String[] cardArr = card.split(regex);
		/*
		for (String c : cardArr) {
			System.out.println(c);
		}
		*/
		System.out.println(Arrays.toString(cardArr));
		
		//0~3 임의의 정수
		Random rnd = new Random();
		int index = rnd.nextInt(4);
		cardArr[index] = "*".repeat(4);
		
		System.out.println(Arrays.toString(cardArr));
		
		String printCard = String.join(regex, cardArr);
		System.out.println(printCard);
		
	}//main

}//class







