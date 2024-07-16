package review01;

import java.util.Scanner;

public class Review_TestScore_02 {

	public static void main(String[] args) {
		
		//이름, 국어,영어,수학을 입력받아서 총점,평균 계산 후 출력하는 코딩을 하세요. ( Scanner 사용 )
		
		String name;
		byte kor, eng, mat;
		short tot;
		double avg;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름, 국어, 영어, 수학?");
		
		// 송세호 92 85 62
		
		name = sc.next();
		kor = sc.nextByte();
		eng = sc.nextByte();
		mat = sc.nextByte();
		tot = (short)(kor+eng+mat);
		avg = (double)tot/3;
		
		sc.close();
		
		System.out.printf("%s, %d, %d, %d, %d, %.2f", name, kor, eng, mat, tot, avg);

	}

}
