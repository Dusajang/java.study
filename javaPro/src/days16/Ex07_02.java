package days16;

/**
 * @author dkrkdfla
 * @date 2024. 7. 22.오후 4:21:04
 * @subject        
 * @content      문자열을 String 클래스 타입으로    +  연결하는 작업은 절대 하면 안되는 작업
 *
 */
public class Ex07_02 {

	public static void main(String[] args) {
		test_String();    //> String 처리 시간 : 4초7921 ms05400ns
		test_StringBuilder();

		
		
		

	}//main

	private static void test_StringBuilder() {
		long start = System.nanoTime();
		StringBuilder s = new StringBuilder("a");
		for (int i = 0; i < 200000; i++) {
			s.append("a");
		}
		long end = System.nanoTime();
		System.out.printf("> StringBuilder 처리 시간 : %dns\n", (end-start));
		
	}

	private static void test_String() {
		long start = System.nanoTime();
		String s = "a";
		for (int i = 0; i < 200000; i++) {
			s += "a";
		}
		long end = System.nanoTime();
		System.out.printf("> String 처리 시간 : %dns\n", (end-start));
	}

}//class













