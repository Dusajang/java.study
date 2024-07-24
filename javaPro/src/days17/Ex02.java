package days17;

import java.util.Arrays;

/**
 * @author dkrkdfla
 * @date 2024. 7. 23.오전 11:43:48
 * @subject
 * @content
 *
 */
public class Ex02 {

	public static void main(String[] args) {
		String[] answer = solution("abc1Addfggg4556b",6);  // 문자열을 주어진 정수자리수로 나누겠다. 
		System.out.println(Arrays.toString(answer));
		//		String[] answer = solution("abcdef123", 	3);
		//		System.out.println(Arrays.toString(answer));

	}//main

	public static String[] solution(String my_str, int n) {
		int length = (int) Math.ceil( (double) my_str.length()/n );
		String[] answer = new String [length];

		int i;
		for (i = 0; i < length-1; i++) {

			answer[i] = my_str.substring(i*n, (i+1)*n); //6자리라고 하면, .substring(0, 6) -> .substring(6, 12) -> .substring(12, 16)
		}
		answer[length-1] = my_str.substring(i*n);     // 배열 마지막칸을 따로 빼서 주겠다.





		/* 1번 풀이
	        int beginIndex = 0, endIndex =n;
	        int my_strLength = my_str.length();
//	        answer[0] = my_str.substring(0, n);
//	        answer[i] = my_str.substring(i*n, (i+1)*n);
//	        //answer[2] = my_str.substring(12, 18);

	        for (int i = 0; i < length; i++) {
	        	beginIndex = i*n;
	        	endIndex = (i+1)*n;
	        	if(endIndex > my_strLength) endIndex = my_strLength;
	        	answer[i] = my_str.substring(beginIndex, endIndex);
			}
		 */
		return answer;
	}

}//class
