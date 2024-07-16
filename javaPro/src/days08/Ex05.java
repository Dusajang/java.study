package days08;

/**
 * @author dkrkdfla
 * @date 2024. 7. 10. - 오후 5:06:26
 * @subject		
 * @content		매개변수 + 메서드 호출 방법
 * 						1) Call By Name
 * 						2) Call By Value
 * 						3) Call By Reference
 *
 */
public class Ex05 {

	public static void main(String[] args) {
		
		//메서드 호출
		//drawLine();			1) Call By Name
		
		//2) Call By Value
		int a = 10, b=20;
		System.out.println(hap(a,b));

	}//main
	
	//메서드 선언 부분
	public static int hap(int a, int b) {
		return a+b;
	}
	public static void drawLine() {
		System.out.println("---------------------");
	}
	
}//class







