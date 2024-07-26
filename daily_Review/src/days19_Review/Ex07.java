package days19_Review;

import java.util.HashSet;

/**
 * @author dkrkdfla
 * @date 2024. 7. 25. 오후 10:23:43
 * @subject   HashSet
 * @content
 *
 */
public class Ex07 {

	public static void main(String[] args) {
		/*
		 *  Set
		 *  순서 없음, 중복도 허용하지 않음
		 *  
		 *  HashSet 컬렉션 클래스
		 *  내가 입력한 순서가 아닌 자체적인 순서로 정렬한다.
		 *  내가 입력한 순서대로 저장하는 것은 LinkedHashSet
		 */

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
	}

}
