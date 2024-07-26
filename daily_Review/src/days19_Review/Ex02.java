package days19_Review;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

/**
 * @author Victor
 * 2024. 7. 25. 오후 9:23:57
 * @subject
 * @content       List                set                   map
 *             1) ArrayList
 *             2) Vector 컬렉션 클래스
 *                차이점 : 멀티스레드 안전(동기화 처리 O)
 *                
 * StringBuffer   멀스안전 O, 동기화 O
 * StringBuilder  멀스안전 X, 동기화 X
 *
 */
public class Ex02 {

	public static void main(String[] args) {
		Vector vt = new Vector(); // 기본 (10)
		vt.addElement("김재민");
		vt.addElement("전재윤");
		vt.addElement("김선우");
		vt.addElement("최사랑");
		vt.addElement("김선우");
		vt.addElement(null);
		System.out.println(vt);
		System.out.println(vt.size());
		System.out.println(vt.capacity());
		
		vt.trimToSize();     // 용량에서 비어있는 공간 제거
		System.out.println(vt.capacity());
		
		System.out.println(vt.get(1));
		System.out.println(vt.elementAt(1));
		
		vt.set(1, "XXX");
		vt.setElementAt("YYY", 1);
		
		System.out.println("-".repeat(30));
		
		Iterator ir =  vt.iterator();
		while (ir.hasNext()) {
			String name = (String) ir.next();
			System.out.println(name);
		}
		
		vt.firstElement();  //vt.get(0)
		vt.lastElement();//vt.get(vt.size()-1);
		
		int index = vt.indexOf("YYY");
		
		vt.insertElementAt("이시훈", index+1);
		
		System.out.println(vt);
		
		Vector subVt = new Vector();
		for (int i = 2; i <= 4; i++) {
			subVt.addElement(vt.get(i));
		}
		
		List subList = vt.subList(2, 5);
		System.out.println(subList);
		
	}//main

}//class











