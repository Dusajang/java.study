package days16;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex05_02 {

	public static void main(String[] args) {
		// days16.Ex01.java  읽어와서
		// "예외" 문자열이 있는 위치값을 모두 출력

		//String fileName = "C:\\Class\\Workspace\\JavaClass\\javaPro\\src\\days16\\Ex01.java";
		String fileName = ".\\src\\days16\\Ex01.java";
		String content = getFileContent(fileName);
		
		
		/*
		// days11.Ex03
		int index, fromIndex= 0;
		while ((index =content.indexOf("예외")) !=-1) {
			System.out.println(index);
			fromIndex = index+1;
		}
		*/
		
		// 예외라는 문자열을 모두 찾아서 삭제
		//content = content.replace("예외", "[예외]");
		//                                       regex
		// 홍길동 홍길남 홍길순
		//content = content.replaceAll("예외", "[예외]");
		
		//content.replace("예외", "");
		System.out.println(content);



	}//main

	private static String getFileContent(String fileName) {
	    FileReader reader = null;
//	    Buffer 기능, readLine() : 한 라인을 읽어와서 return
	    BufferedReader br = null;
	    int one = -1;

	    String content = "";
	    try {
	      reader = new FileReader(fileName);
	      br = new BufferedReader(reader);//다른 객체로부터 다시 Stream object를 만드는 것이기 때문에 보조 stream, 2차 stream이라고 불리운다.

//	      System.out.println((char)one);
	      String line = null;
	      int lineNum = 1;
	      while ((line = br.readLine()) != null) {
//	        System.out.printf("%d : %s\n", lineNum++, line);
	        content += line + "\r\n";
	      }

	    } catch (FileNotFoundException e) {
	      e.printStackTrace();
	    } catch (IOException e) {
	      e.printStackTrace();
	    } finally {
	      if (reader != null) {
	        try {
	          reader.close();
	          reader = null;//닫고나서 null로
	          br.close();
	          br = null;//닫고나서 null로
	        } catch (IOException e) {
	          e.printStackTrace();
	        }
	      }
	    }
	    return content;
	  }
	

	


}//class
