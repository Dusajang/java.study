package ch01.verify;

import java.util.Scanner;

public class Quiz_Switch01 {
	public static void main(String[] args) {
		//국어점수를 입력받아서 수/우/미/양/가 출력(switch문)
		
		int score;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("국어점수??");
		
		score = sc.nextInt();
		
		if(score < 0 || score > 100)
        {
            System.out.println("잘못된 점수 입니다.");
        }
        else {
            
        switch (score/10) {
        
            case 10 : System.out.println("수"); break;
        
            case 9 : System.out.println("수"); break;
        
            case 8 : System.out.println("우"); break;
        
            case 7 : System.out.println("미"); break;
            
            case 6 : System.out.println("양"); break;
        
            default: System.out.println("가");
            }
        }
		
		sc.close();
		
	}//main

}//class
