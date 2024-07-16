package days09_Review;

public class Home_Review04 {

	public static void main(String[] args) {
		// 4. 합을 구하는 재귀함수 선언 
		
		int a = 10;
		
		int result = recursiveHap(a);
		System.out.println(a);

	}

	private static int recursiveHap(int a) {
		if (a==1) return a;
		else return a+ recursiveHap(a-1);
		
		
		
	}

}
