package days03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author dkrkdfla
 * @date 2024. 7. 3. - 오전 10:51:25
 * @subject   [S]canner  클래스==물건,객체,개체
 * @content
 *
 */
public class Ex02_02 {
	public static void main(String[] args) throws IOException {
        
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		String name;
		byte age = 20;
		
		System.out.print(">이름을 입력하세요.");
        name = bufferedReader.readLine();
        
        
        System.out.print(">나이를 입력하세요.");

        // Type mismatch: cannot convert from String to byte
        // 타입 변환, 형 변환
        //"20" -> 20
        // String -> byte  Byte.parseByte()
        // String -> int   Integer.parseInt()  
        // String -> short Short.parseShort()
        // String -> long  Long.parseLong()

        
     String strAge = bufferedReader.readLine(); // "20"
      age = Byte.parseByte(strAge);      
      age = Byte.parseByte(bufferedReader.readLine());
      
      //문제점 : 나이를 입력이 잘못되면

		
        System.out.printf("이름 = \"%s\", 나이 = %d" , name, age);
		
	}//main

}//class
