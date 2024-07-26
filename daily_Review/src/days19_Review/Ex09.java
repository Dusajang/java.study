package days19_Review;

import java.util.LinkedHashSet;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.ToString;

public class Ex09 {

	public static void main(String[] args) {
		
		Set s = new LinkedHashSet();
		s.add(new Person("victor", "송세호", 29));
		s.add(new Person("admin", "관리자", 25));
		s.add(new Person("hong", "홍홍홍", 32));
		
		//Id가 같은 person은 중복처리해서 추가X
		s.add(new Person("admin", "관리자", 30));
		System.out.println(s);

	}//main
	


}//class

@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
class Person{
	String id;
	String name;
	int age;
	
	@Override
	public int hashCode() {
	
		return this.id.hashCode();   // id의 해시코드값 
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Person) {
			Person p = (Person) obj;
			return p.id.equals(this.id);
		}
		return false;
	}
	
	
	
}




