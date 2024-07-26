package days20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static java.util.Collections.*;

/**
 * @author dkrkdfla
 * @date 2024. 7. 26.오전 11:50:07
 * @subject
 * @content
 *
 */
public class Ex04 {

	public static void main(String[] args) {
		//Arrays 클래스 : 배열을 사용하기 쉽도록 기능이 구현된 클래스
		int [] m = {3,5,2,4,1};
		//Arrays.sort(m);
		//Arrays.binarySearch(m, 5);
		//Arrays.toString(m);
		//Arrays.fill(m, -1);
		
		//Collections 클래스
		//Collections.reverseOrder()
		ArrayList<Integer> list = new ArrayList<Integer>();
//		list.add(3);
//		list.add(5);
//		list.add(2);
//		list.add(4);
//		list.add(1);
		addAll(list, 3,5,2,4,1);
		System.out.println(list);
		rotate(list, 2);  //오른쪽으로 2칸씩 회전
		System.out.println(list);
		swap(list, 0, 3);
		System.out.println(list);
		Collections.shuffle(list);  //임의의 자리 변경, 섞기
		System.out.println(list);
		
		Collections.sort(list);   // 오름차순 정렬
		Collections.sort(list, Collections.reverseOrder());
		//Collections.sort(list, (a,b) -> b-a);
		System.out.println(list);
		
		Collections.fill(list, -1);
		System.out.println(list);
		

	}//main

}//class





