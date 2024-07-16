package days04;

public class Ex04 {

	public static void main(String[] args) {
		//쉬프트 연산자    >>   <<   >>>
		//		ㄴ비트 연산자
		//		ㄴ물건을 이동시키다. 옮기다.
		
		System.out.println(10);
		System.out.println(Integer.toBinaryString(10));
		// 00000000 00000000 00000000 00000000 00001010
		System.out.println(10>>2); //2
		// __00000000 00000000 00000000 00000000 000010
		System.out.println(10>>>2);
		System.out.println(10<<2);
		// 000000 00000000 00000000 00000000 00001010__
		
		
		// 0000 0011
		System.out.println(  3  );
		System.out.println( Integer.toBinaryString(3) );
		String binStr = Integer.toBinaryString(3);
		System.out.printf("%08d\n", Integer.parseInt( binStr )  ); // "11" -> 11 형변환
		//위의 코드에서 %08d 에 설명하면 다음과 같다.
		//% : 명령 시작을 의미
		//0 : 채워질 문자
		//8 : 총 자리수
		//d : 십진수로 된 정수

		//int no = 15;
		//System.out.printf("%08d\n", no);
		


	}

}
