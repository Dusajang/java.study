package days19;

import java.util.HashSet;

/**
 * @author dkrkdfla
 * @date 2024. 7. 25.오후 2:07:18
 * @subject
 * @content
 *
 */
public class Ex07 {

	public static void main(String[] args) {
		//Set - 순서 X, 중복 X
		//          HashSet 컬렉션 클래스
		//          순서 0 + Set = LinkedHashSet 컬렉션 클래스
		HashSet hs = new HashSet();
		hs.add(9);
		hs.add(11);
		hs.add(15);
		hs.add(10);
		
		//순서유지X  [9, 10, 11, 15]
		System.out.println(hs);
		// 중복X
		hs.add(11);
		System.out.println(hs);
		
		
	}//main

}//class










