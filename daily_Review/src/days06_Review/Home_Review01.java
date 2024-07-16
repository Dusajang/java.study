package days06_Review;

public class Home_Review01 {

	public static void main(String[] args) {
		//1. 1-2+3-4...-8+9-10=-5
		
		int sum = 0;
		boolean sw = false;
		for (int i = 1; i <= 10; i++) {
			if (!sw) {
				System.out.printf("%d-", i);
				sum+=i;
			}else {
				System.out.printf("%d+",i);
				sum-=i;
			}
			sw=!sw;
		}
		System.out.printf("=%d", sum);
		
	}//main

}//class







