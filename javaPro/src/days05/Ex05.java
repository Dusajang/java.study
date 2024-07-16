package days05;

public class Ex05 {

	public static void main(String[] args) {
		//[문제4] 1~10까지의 홀수의 합(while)
		//2 풀이
		int sum = 0;
		int i =1;
		
		while (i <=10) {				//2 참
			if (i%2==0) {				// 2%2 == 0 참
				i++; 
				continue;
			}//if
			System.out.printf("%d+", i);		//1+
			sum+=i;	//sum = 1
			i++;			// i = 2
		}//while
	
		System.out.printf("=%d", sum);
		
		

	}//main

}//class





/* 1번 풀이
int sum = 0;
int i =1;

while (i <=10) {
	if (i%2!=0) {
		System.out.printf("%d+", i);
		sum+=i;
		
	}//if
	i++;
}//while

System.out.printf("=%d", sum);
*/







