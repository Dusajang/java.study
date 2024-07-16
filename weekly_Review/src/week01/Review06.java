package week01;

import java.util.Scanner;

public class Review06 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String name;
		int kor, eng, mat;
		//송세호 90 80 70
		System.out.print("이름, 국어점수, 수학점수, 영어점수 입력");
		
		name = scanner.next();
		kor = scanner.nextInt();
		eng = scanner.nextInt();
		mat = scanner.nextInt();
		
		int tot = kor+eng+mat;
		double avg = (double)(kor+eng+mat)/3;
		char grade;
		
		if (avg >= 90) {
			grade = 'A';
		}else if (avg >=80) {
			grade = 'B';
		}else if (avg >= 70) {
			grade = 'C';
		}else if (avg >=60) {
			grade = 'D';
		} else grade = 'F';
		
		
		System.out.printf("%s %d %d %d %d %.2f \'%c\'", name, kor, eng, mat, tot, avg, grade);
	}//main

}//class


/*
6. 이름, 국어, 영어, 수학 을 입력받아서
총점, 평균을 계산하고
평균이 90~100 'A', 평균이 80~89 'B' ~ 평균이 0~59 'F' 로 처리해서
[출력 형식]
홍길동 90 83 92 265 83.33 'B' 



*/