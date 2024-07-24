package days17;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author dkrkdfla
 * @date 2024. 7. 23.오후 2:36:30
 * @subject             정규표현식
 * @content
 *
 */
public class Ex07 {

	public static void main(String[] args) {
		/*
		*1. 정규표현식(regular expression == regex)
		* - 미리 정의된 기호
		* - 문자열 속에 원하는 패턴(조건)과 일치하는 문자열을 찾아내기 위해서 사용된다.
		* - boolean String.matches(regex)
		* - java.util.regex 패키지
		*              ㄴ pattern
		*               ㄴMatcher         		
	    */
		String [] data = {
	            "bat","baby","bonus","cA","ca","co", "c.", "c0", "car"
	                , "combat", "count", "date", "disc", "fx"
	                };

		//1) c문자로 시작하는 문자열 찾아서 출력
		//String regex = "c";
		//String regex = "^c.*";
		String regex = "c.*";                               //자바는 기본으로 정규표현식으로 시작하는
		for (int i = 0; i < data.length; i++) {
			//if (data[i].startsWith("c")) {System.out.println(data[i]);
			if (data[i].matches(regex)) {System.out.println(data[i]);
			}
		}
	
		//String regex ="c.*";
	      regex ="c[a-zA-Z]*";
	      regex ="c[a-zA-Z0-9]*";
	      regex ="c\\w*";  // [a-zA-Z0-9]  == \\w
	      regex ="c.";
	      regex ="c\\.";
	      regex ="c[0-9]";
	      regex ="c\\d";
	      regex ="c.*t";      // == "^c.*t$"
	      regex ="c[^0-9]";    //두번째 문자는 숫자가 아닌
	      regex ="c\\D";   // [^0-9] == \\D
	      regex ="(b|c).{2}";
	      regex ="[bc].{2}";
	      regex ="[bcd].{2,3}";
	      regex ="[b-d].{2,3}";
	      // bcd 문자는 제외한 알파벳 대소문자
	      regex ="[A-Za-z&&[^b-d]].*";  // *  0개 이상 
	      regex ="[A-Za-z&&[^b-d]].+";  // +  1개 이상 
	      regex ="[A-Za-z&&[^b-d]].?";  // ?  0,1   0번 또는 1번
	
	      // 패턴 객체p
	      Pattern p = Pattern.compile(regex);
	      for (int i = 0; i < data.length; i++) {
	    	  //매쳐 객체 m
			Matcher m = p.matcher(data[i]);
			if (m.matches()) System.out.println(data[i]);
		}
	
	      
	      //[문제] 비밀번호를 입력 받아 유효성 체크하는 정규표현식을 사용해서
	      //            비밀번호의 길이가 8~15문자
	      //                 숫자가 반드시 1개 이상
	      //                     소문자가 반드시 1개 이상
	      //                    대문자가 반드시 1개 이상
	      //                    특수문자 1개 이상    #@$%
	      
	      
	}//main
	
	
	
	
	
	

}//class















