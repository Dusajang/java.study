package days03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex03_02 {

	public static void main(String[] args) throws IOException{
		
		//int i = 2147483647;
		int i = Integer.MAX_VALUE;
		int j = 100;
		
		long k = (long)i + j;
		// 2147483647 + 100 = -2147483549	
		System.out.printf("%d + %d = %d\n", i, j, k);
        
		
		//2
		//String 이름
		//byte국어, 영어, 수학
		//short총, double 평균 계산
		//[출력형식]홍길동, 90 89 81, 270 90.00
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String name;
		byte kor, eng, mat;
		short tot;
		double avg;
		
		System.out.print(">이름을 입력하세요.");
        name = br.readLine();
        
        
        System.out.print(">국어 입력.");
        kor = Byte.parseByte(br.readLine());
        System.out.print(">영어 입력.");
        eng = Byte.parseByte(br.readLine());
        System.out.print(">수학 입력.");
        mat = Byte.parseByte(br.readLine());
        
        
        //Type mismatch: cannot convert from int to short
        tot = (short)(kor + eng + mat);
        avg =(double)tot / 3;
        
        System.out.printf("%s\t%d\t%d\t%d\t%d\t%f\n" , name, kor, eng, mat, tot, avg);
 
   
	}
	

}
