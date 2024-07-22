package days16;

/**
 * @author dkrkdfla
 * @date 2024. 7. 22.오후 12:31:58
 * @subject
 * @content         clone()에 대한 설명
 *
 */
public class Ex03_02 {

	public static void main(String[] args) {
		
		Person p1 = new Person("123456-1234567", "홍길동");
		
		try {
			Person p2 = (Person) p1.clone();
		} catch (CloneNotSupportedException e) {
			
			e.printStackTrace();
		}
		
		// ㅁ. equals()
		//     finalize()
		//     notify(), notifyAll(), wait()  x     스레드 수업 선행 필요
		
		//p1.clone();

	}

}


class Person implements Cloneable{   //그냥은 .clone()이 안됨.  implements Cloneable해서 클론 하겠다
	
	@Override
	public int hashCode() {
		return rrn.hashCode();
	}

	//p1.equals(p2)
	@Override
	public boolean equals(Object obj) {
		
		if (obj instanceof Person) {
			Person p = (Person)obj; //다운캐스팅
			return this.rrn.equals(p.rrn);
		}
		return false;
	}

	//필드
	String rrn;
	String name;
	
	//생성자
	public Person(String rrn, String name) {
		super();
		this.rrn = rrn;
		this.name = name;
	}

	//오버라이드 된 toString 함수
	@Override
	public String toString() {
		return "Person [rrn=" + rrn + ", name=" + name + "]";
	}

	//p1.clone()
	//부모의 clone() 메서드를 오버라이딩했기 때문에
	//리턴자료형이 Object라야 하지만
	//리턴자료형을 복제하는 클래스 타입으로 변경할 수 있도록
	//jdk1.5 "공변변환타입"
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		Person pClone = null;
		pClone = (Person) super.clone();  //Object -> Person 다운캐스팅
		return pClone;
	}
	
	
	
}















