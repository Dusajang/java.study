package ch01.verify;

import java.util.Scanner;

public class Day03_Review3 {

	public static void main(String[] args) {
		//이름, 국어,영어,수학을 입력받아서 총점,평균 계산 후 출력하는 코딩을 하세요. ( Scanner 사용 )
		
		String name;
		byte kor, eng, mat;
		short tot;
		double avg;
		
		System.out.print("이름, 국어, 영어, 수학");
		
		Scanner sc = new Scanner(System.in);
		
		name = sc.next();
		kor = sc.nextByte();
		eng = sc.nextByte();
		mat = sc.nextByte();
		tot = (short)(kor + eng + mat);
		avg = (double)tot/3;
		
		sc.close();
		
		System.out.printf("%s, %d, %d, %d, %d, %f", name, kor, eng, mat, tot, avg);
		
		
	}

}
