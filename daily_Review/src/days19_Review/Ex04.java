package days19_Review;

import java.util.Stack;

/**
 * @author Victor
 * 2024. 7. 25. 오후 10:05:16
 * @subject
 * @content
 *
 */
public class Ex04 {

	public static void main(String[] args) {
		/*
		 * 스택 구조와 큐 구조
		 * 스택 : 늦게 들어온 게 먼저 나간다.
		 *       push(), pop(), empty(), search() peek()
		 */
		Stack s = new Stack();
		s.push("박준용");
		s.push("김준석");
		s.push("김재민");
		s.push("전재윤");
		
//		System.out.println( s.pop() );        
//		System.out.println( s.peek() );       
//		System.out.println( s.size() );       
//		                                      
//		System.out.println(s.search("홍길동"));  
//		System.out.println(s.search("김재민"));  
//		System.out.println(s.indexOf("김재민")); 
//		
		while (!s.empty()) {
			System.out.println( s.pop() );
		}
	}

}
