package days06;


public class Ex04_02 {

	public static void main(String[] args) {
		//다섯 정수(a, b, c)를 입력받아서 max, min 출력
		int a, b, c, d, e;
		
		a = (int) ((Math.random()*100)+1);
		b = (int) ((Math.random()*100)+1);
		c = (int) ((Math.random()*100)+1);
		d = (int) ((Math.random()*100)+1);
		e = (int) ((Math.random()*100)+1);
		
		
		
		
		  /*
	      int max = a > b ?  a : b;
	      max =  max > c ? max : c;

	      int min = a > b ? ( b > c? c: a): ( a > c ? c : a );
	      */
		
		
	      int max = Math.max( Math.max(a, b), c);

	      int abMin = Math.min(a, b);
	      int min = Math.min( c , abMin);
	      

	}//main

}//class
