package days05;

/**
 * @author dkrkdfla
 * @date 2024. 7. 5. - 오후 4:51:15
 * @subject
 * @content		//char[]
						//for 문
						//String.charAt()
 *
 */
public class Ex09 {

	public static void main(String[] args) {
		//char[]
		//for 문
		//String.charAt()
		String todo = "Auto-generated method stub";
		//System.out.println( todo.length() );         //문자열의 길이를 .length()
		int size = todo.length();
		char [] todoCharArr = new char[size];
		//todoCharArr.length
		/*
		todoCharArr[0] = todo.length(0);
		todoCharArr[1] = todo.length(1);
		todoCharArr[2] = todo.length(2);
		todoCharArr[3] = todo.length(3);
		:
		todoCharArr[25] = todo.length(25);
		*/
		
		for (int i = 0; i < todoCharArr.length; i++) {
			todoCharArr[i] = todo.charAt(i);
		}
		//String -> char[] 변환
		//char[] ->String 변환
		String target = "";
		for (int i = 0; i < todoCharArr.length; i++) {
		target += todoCharArr[i];
		}
		System.out.println(target);
	}//main

}//class












