package days09;

/**
 * 		재귀함수 recursive function
 * 		순환, 되풀이되는, 재귀하는
 * 		함수 안에서 자기 자신을 다시 호출하는 함수
 * @author User
 *
 */
public class Ex03 {

	public static void main(String[] args) {
		
		disp();

	}

	private static void disp() {
		System.out.println("disp()...");
		disp();
		
	}//main

}//class
