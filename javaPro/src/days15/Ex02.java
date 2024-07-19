package days15;

public class Ex02 {

	public static void main(String[] args) {
		//추상메서드(abstract method)
		//   ㄴ 몸체(body)가 없는 메서드
		//추상클래스(abstract class)
		//  ㄴ 공통적인 멤버를 가진 클래스를 설계...
		//  ㄴ 객체를 생성할 수 없다.

	 Parent p = new Child();
	 p.dispA();
	}

}

abstract class Parent{
	//필드
	//생성자
	//메서드
	abstract void dispA();
	abstract void dispB();
	abstract void dispC();
	//메서드
}

class Child extends Parent{

	@Override
	void dispA() {
		
		
	}

	@Override
	void dispB() {
		
		
	}

	@Override
	void dispC() {
		
		
	}
	
}




