package ch01.verify;

import java.util.Arrays;

public class Afgsdf {

    int[] solution(int numer1, int denom1, int numer2, int denom2) {
    	
    	numer1=1; // 분자
    	denom1=2; // 분모
    	
    	numer2=3; // 분자
    	denom2=4; // 분모
    	
    	int[] answer = new int[2];
    	

    	answer[0] = ((numer1*denom2)+(numer2*denom1)) / gcd(denom1, denom2);
    	answer[1] = (denom1*denom2)/gcd(denom1, denom2);	
    	
    	
    	
        return answer;
    }



private static int gcd(int a, int b) {  //최대공약수
	  int r;
	  while (b != 0) {
	    r = a % b;
	    a = b;
	    b = r;
	  }
	  return a;
	}

}


