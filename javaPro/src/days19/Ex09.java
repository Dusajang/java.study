package days19;

import java.util.LinkedHashSet;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author dkrkdfla
 * @date 2024. 7. 25.오후 2:48:20
 * @subject
 * @content
 *
 */
public class Ex09 {

	public static void main(String[] args) {
		//List : 어레이리스트AL. 벡터V. 링크드리스트LL, 스텍S, 링크드리스트LL(큐, 디큐), 프라이오리티큐(우선순위)PQ
		//Set : HashSet, 
//		new Person1()
//		.builder()
//		.name("홍길동")
//		.age(20)
//		.id("victor")
//		.build();
		
		Set s = new LinkedHashSet();
		s.add(new Person1("victor","홍길동", 20 ));
		s.add(new Person1("admin","관리자", 25 ));
		s.add(new Person1("hong","홍길남", 32 ));
		
		//ID가 똑같은 Person1 객체는 중복 처리를 해서 추가 X
		s.add(new Person1("admin","관리자", 36 ));
		System.out.println(s.size());
		
		
		

	}//main

}//class

@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
class Person1{
	String id;  //식별자
	String name;
	int age;
	
	@Override
	public int hashCode() {
		return this.id.hashCode();   // id의 해시코드값 
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Person1) {   
			Person1 p = (Person1) obj;    //
			return p.id.equals(this.id);
		}
		return false;
	}
	
	
	
}