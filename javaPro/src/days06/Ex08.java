package days06;

/**
 * @author dkrkdfla
 * @date 2024. 7. 8. - 오후 4:19:41
 * @subject
 * @content
 *
 */
public class Ex08 {

	public static void main(String[] args) {
		//[순서도]
		//1-2+3-4...-8+9-10=-5
		//홀수일때는 sum+= i        %d-
		//짝수일때는 sum-= i         %d+
		int sum = 0;
		
		//3. 풀이(시험)
		boolean sw =false;
		for (int i = 1; i <= 10; i++) {
			if (!sw) {
				System.out.printf("%d-", i);
				sum += i;
			} else {
				System.out.printf("%d+", i);
				sum -= i;
			}
			sw = !sw;
		}//for
		
		
		
		
		/*
		 //2. 풀이
		for (int i = 1; i <= 10; i++) {
			System.out.printf(i%2==0? "%d+" : "%d-",i);
			sum += i%2==0? -i : i;
		*/	
		
		
		
		
		
		/*1번 풀이
		for (int i = 1; i <= 10; i++) {
			if (i%2==0) {
				System.out.printf("%d+", i);
				sum -= i;
			} else {
				System.out.printf("%d-", i);
				sum += i;
			}
			
		}
		*/
		
		
		System.out.printf("=%d\n", sum);
		
	}//main

}//class








