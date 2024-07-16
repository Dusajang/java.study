package days05;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		/*
		//대문자를 소문자로 변환하는 코딩을 하세요. 
		   char uc = 'A';  
		   char lc = (char)(uc + 32);
		*/
		
		
		   /*
		// 2.  1+2+3+..+9+10=55   출력하는 코딩( for문 사용 )
		
		   int sum = 0;
		   for (int i = 0; i <= 10; i++) {
			   System.out.printf(i==10?"%d":"%d+", i);
		   }//for
		   */
		   
		   /*
			   if (i == 10) {
				   System.out.printf("%d", i);
			} else {System.out.printf("%d+", i);

		}//for
		   System.out.printf("=%d",sum);
		   */
		   
		   
		   /*
		   int sum = 0;
		   for (int i = 0; i <= 10; i++) {
			   System.out.printf("%d+", i);
			sum += i; 
		}//for
		   System.out.printf("=%d",sum);
		   */
		   
		   
		   
		   /*
		   // 4. for문을 사용해서  아래와 같이 출력하는 코딩을 하세요.
		   for (int i = 0; i <= 10; i++) {
			System.out.printf("%02d - " + "헬로우 월드\n", i);
		}//for
		*/
		   
		   
		   
		   
		   //7번 문제
		   //팀원들을 입력하세요 ? 홍길동,이시훈, 송세호
		   
		   //String team;
		   System.out.print("팀원들을 입력하세요.");
		   @SuppressWarnings("resource") //p556
		Scanner scanner = new Scanner(System.in);
		   
		   String data = scanner.nextLine();
		   System.out.print(data);
		   String regex = "\\s*,\\s*";
		   String [] names = data.split(regex);
		   
		   for (int i = 0; i < names.length; i++) {
			   System.out.printf("%d. 팀원 : %s\n", i+1,  names[i]);
		}
		   
		   /*
		   System.out.printf("1. 팀원 : %s\n", names[0]);
		   System.out.printf("2. 팀원 : %s\n", names[1]);
		   System.out.printf("3. 팀원 : %s\n", names[2]);
		   */
		   
		   
		   
		   
	}//main

}//class





