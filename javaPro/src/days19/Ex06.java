package days19;

import java.util.PriorityQueue;
import java.util.Queue;

public class Ex06 {
	
	public static void main(String[] args) {
		//어레이리스트, 벡터, 링크드리스트, 스텍 큐,디큐
		// PriorityQueue
		// 우선순위 +큐 
		// 들어간 순서 상관없이 우선 순위가 높은 것부터 꺼내오는 큐
		// 작은 숫자가 우선순위가 높다.
		Queue q = new PriorityQueue();
		q.offer(3);
		q.offer(5);
		q.offer(2);
		q.offer(4);
		q.offer(1);
		
		System.out.println(q);
		
		while (!q.isEmpty()) {
			System.out.println(q.poll());
		}
		
	}//main

}//class
