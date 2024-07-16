package days07;

/**
 * @author dkrkdfla
 * @date 2024. 7. 9. - 오후 3:08:28
 * @subject
 * @content
 *
 */
public class Ex05 {

	public static void main(String[] args) {
		//계차수열
		//term(항)1+2+4+7+11+16+22... 항의 갯수가 20개까지의 합
		//  1  2   3  4   5     6   계차(difference)
		
		int term=1;
		int dif = 0;
		int sum=0;
		for (int i = 1; i <= 20; i++) {
			term+=dif;
			System.out.printf("%d+", term);
			dif++;
			sum += term;
		}
		System.out.printf("=%d\n", sum);
	}//main

}//class


/*
 		int sum=0;
		int[] g = new int[20];
		g[0] = 1;
		for (int i = 0; i < 20; i++) {
			g[i]= g[0]+i;
				sum += g[i]+i;
		}
		System.out.println(sum);
		*/
