package days19;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @author dkrkdfla
 * @date 2024. 7. 25.오후 5:09:13
 * @subject
 * @content     HashMap을 HashTable로 바꿔서....결과는 같음
 *
 */
public class Ex12_02 {

	public static void main(String[] args) {
		/*
		 * List - Al, V, LL, S, LL PQ
		 * Set - HS, LHS, TS
		 * [ Map ]
		 * 1. key +value 한 쌍 관리 == Entry(엔트리)
		 * 2. key 중복 x
		 *    value 중복o
		 * 3. HashMap(신) - 사용 권장
		 *    HashTable(구)
		 * 4. 해싱(Hashing)?
		 *    -해시함수를 이용하여 데이터를 해시 테이블에 저장하고 검색하는 기법
		 *    -해시함수?
		 *     데이터를 저장하는 곳을 알려주는 함수
		 *     데이터를 빠르게 검색할 수 있다.
		 *     많은 양의 데이터를 검색할 때 뛰어남.
		 */
		//        id      name
		Hashtable<String, String> hm = new Hashtable<String, String>();
		hm.put("admin", "관리자");
		hm.put("hong", "홍길동");
		hm.put("keni", "이창익");

		Set<Entry<String, String>> es = hm.entrySet();
		Iterator<Entry<String, String>> ir = es.iterator();
		while (ir.hasNext()) {
			Entry<String, String> entry = (Entry<String, String>) ir
					.next();
			System.out.printf("%s=%s\n", entry.getKey(), entry.getValue());
		}

		
		/*
		System.out.println(hm);
		System.out.println(hm.size());  //엔트리의 갯수

		// 1. 모든 key 조회
		Set<String> keys = hm.keySet();
		Iterator<String> ir = keys.iterator();
		while (ir.hasNext()) {
			String key = ir.next();
			System.out.printf("%s=%s\n", key, hm.get(key));
		}

		//value hm.get(key)

		Collection<String> values = hm.values();
		Iterator<String> ir2 = values.iterator();
		while (ir2.hasNext()) {
			String value = ir2.next();
			System.out.printf("%s\n", value);
		}
		 */

	}//main

}//class









