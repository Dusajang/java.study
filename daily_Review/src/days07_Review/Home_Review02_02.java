package days07_Review;

public class Home_Review02_02 {

	public static void main(String[] args) {
		//2. 피보나치 수열
				// 1 	 1	  2	3	5	8	13	21	34...
			    //[0][1][2][3][4][5][6]   [7]    [8]
				
				//[2] = [1]+[0]
				//[3] = [2]+[1]
				//[4] = [3]+[2]
				//:
				//[i] = [i-1]+[i-2]
		////[정보처리 기사 실기]
		//1+1+2+3+5+8+13+21+34...<=100까지의 합
		
		int hang1 = 1;
		int hang2 = 1;
		int hang3;
		int sum = hang1+hang2;
		System.out.printf("%d+%d+", hang1, hang2);
		
		while ((hang3=hang1+hang2) <= 100) {
			System.out.printf("%d+", hang3);
			sum += hang3;
			hang1 = hang2;
			hang2 = hang3;
		}
		System.out.printf("=%d", sum);
		
		

	}//main

}//class



/*
int hang1 = 1;
int hang2 = 1;
int hang3;
int sum = hang1+hang2;
System.out.printf("%d+%d+", hang1, hang2 );

while ((hang3=hang1+hang2) <=100) {
	System.out.printf("%d+", hang3);
	sum += hang3;
	hang1=hang2;
	hang2=hang3;
}
System.out.printf("=%d", sum);
*/


