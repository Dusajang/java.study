package ch01.verify;

import java.util.Scanner;

public class Quiz_if01 {
	public static void main(String[] args) {
		//[문제1] 국어점수를 입력받아서 수/우/미/양/가 출력(if문)
		
		int score;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("국어점수??");
		
		score = sc.nextInt();
		
		if (score >=90 && score <= 100) {System.out.println("수");}
		if (score >=80 && score < 90) {System.out.println("우");}
		if (score >=70 && score < 80) {System.out.println("미");}
		if (score >=60 && score < 70) {System.out.println("양");}
		if (score >=50 && score < 60) {System.out.println("가");}
		if (score < 50) {System.out.println("낙제");}
		
		sc.close();
		
	}//main

}//class
