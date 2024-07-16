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
public class Ex02 {
	public static void main(String[] args) throws IOException {
		
		//Ctrl + Shirt +O  필요한 임포트 자동 추가
		
		//이름을 표준입력장치(키보드)로 부터 입력받아서 출력
		//키보드 -> System.in -> 바이트값을 읽고 문자로 변환 -> 문자열 변환       나중에 stream 배울때
		BufferedReader br = new BufferedReader(new InputStreamReader( System.in ));
		
		//****Unhandled exception type IOException
		System.out.print(">이름을 입력하세요.");
		String name = br.readLine();  //String
		
		System.out.println( name );

	}

}
