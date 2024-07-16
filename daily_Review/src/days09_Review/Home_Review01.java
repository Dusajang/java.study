package days09_Review;

import java.io.IOException;
import java.util.Scanner;

public class Home_Review01 {

	public static void main(String[] args) throws IOException {
		// 1. 30 명 학생의 성적처리
		String name;
		int kor, eng, mat, tot;
		double avg;
		
		final int STUDENT_COUNT = 30;
		
		String names[] = new String[STUDENT_COUNT];
		int kors[] = new int[STUDENT_COUNT];
		int engs[] = new int[STUDENT_COUNT];
		int mats[] = new int[STUDENT_COUNT];
		int tots[] = new int[STUDENT_COUNT];
		double avgs[] = new double[STUDENT_COUNT];
		
		Scanner scanner = new Scanner(System.in);
		char con = 'y';
		
		int count = 0;
		
		do {
			System.out.printf(">%d번 학생 이름, 국어, 영어, 수학, 입력", count+1);
			
			name = scanner.next();
			kor = scanner.nextInt();
			eng = scanner.nextInt();
			mat = scanner.nextInt();
			tot = kor + eng + mat;
			avg = (double)tot/3;
			
			names[count] = name;
			kors[count] = kor;
			engs[count] = eng;
			mats[count] = mat;
			tots[count] = tot;
			avgs[count] = avg;
			
			count++;
			
			System.out.print("계속하려면 'Y' 입력");
			con = (char) System.in.read();
			System.in.skip(System.in.available());
		} while (Character.toUpperCase(con) == 'Y');
		
		System.out.printf("총 %d 명\n", count);
		
		for (int i = 0; i < count; i++) {
			System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\n", names[i], kors[i], engs[i], mats[i], tots[i], avgs[i]	);
		}
		
	}//main

}//class

/*
 		String name;
		int kor, eng, mat, tot;
		double avg;

		final int STUDENT_COUNT = 30;

		String [] names = new String[STUDENT_COUNT];
		int[] kors = new int[STUDENT_COUNT];
		int[] engs = new int[STUDENT_COUNT];
		int[] mats = new int[STUDENT_COUNT];
		int[] tots = new int[STUDENT_COUNT];
		double[] avgs = new double[STUDENT_COUNT];

		Scanner scanner = new Scanner(System.in);
		int count = 0;  //입력받은 학생 수

		char con = 'y';

		do {
			System.out.printf(">%d번 학생 이름, 국어, 영어, 수학, 입력", count+1);

			name = scanner.next();
			kor = scanner.nextInt();
			eng = scanner.nextInt();
			mat = scanner.nextInt();
			tot = kor + eng + mat;
			avg = (double)tot/3;

			names[count] = name;
			kors[count] = kor;
			engs[count] = eng;
			mats[count] = mat;
			tots[count] = tot;
			avgs[count] = avg;

			count++;
			System.out.println("계속 입력 'Y'");
			con = (char) System.in.read();
			System.in.skip(System.in.available());

		} while (Character.toUpperCase(con) == 'Y');

		System.out.printf("총 학생 수 : %d\n", count);
		*/







