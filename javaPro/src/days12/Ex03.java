package days12;

/**
 * @author dkrkdfla
 * @date 2024. 7. 16.오후 12:17:45
 * @subject
 * @content
 *
 */
public class Ex03 {

	public static void main(String[] args) {
		//지역변수는 접근지정자 X
		//public int age = 10;
		
		//배열
		int [] m = null;
		m = new int[3];
		//								  stack
		//[0][0][0]					[0x100]
		//0x100							m변수, 참조변수, 배열명
		
		
		//인스턴스																				객체
		//	[power][channel][color][p()][cu()][cd()]							[0x200]
		//	0x200																				t1 변수, 참조변수,객체
		
		//객체의 설계도
		// 객체 : 클래스를 자료형으로 선언된 참조변수
		//new heap영역에 메모리 할당
		
		//함수코드 영역
		//power()
		//channelUP() 
		//channerDown()
		Tv t1;				//객체 선언
		t1 = new Tv(); // 객체 생성, 인스턴스화
		
		//멤버들을 접근하는 방법 : 객체명.필드명,  객체명.메서드명()
		//Tv. 클래스명.
		t1.power();
		System.out.println(t1.power? "O":"X" );
		
		t1.channel = 10;
		System.out.println(t1.channel);
		t1.channelDown();
		
		
		t1.power();
		System.out.println(t1.power? "O":"X" );
		

	}//main

}//class










