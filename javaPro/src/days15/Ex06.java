package days15;

/**
 * @author dkrkdfla
 * @date 2024. 7. 19.오후 2:31:06
 * @subject
 * @content
 *
 */
public class Ex06 {

	public static void main(String[] args) {
		/*
		 * [final 키워드 정리]
		 * 
		 */
		//final + 변수 : 상수
		final double PI = 3.141592;
		//PI = 3.141592;
		
		FinalTest ft = new FinalTest();
		ft.test(10);
		
		

	}//main

}//class

class P {
	
	//필드
	final int MAX_VALUE = 1;  // 명시적 초기화
	final int MIN_VALUE ; 
	
	P(int minValue){ // 생성자 초기화
		MIN_VALUE = minValue;
	}
	
	
	
	final int disp() {
		final int age = 100;
		//
		return 0;
	}
	
}
class C extends P {

	C(int minValue) {
		super(minValue);
		
	}
	/*
	@Override // final 메서드는 자식클래스에서 재정의할 수 없다. 오버라이딩 못하는 메서드
	int disp() {
		//
		return 100;
	}
	*/
}



// 1. final + class 선언 : 최종(마지막) 클래스
final class FinalTest{
	
	void test(final int n) {
		//n=100;  메서드가 끝날 때까지 매개변수르 상수로 받는다.
	}
	
}






