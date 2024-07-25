package days19;

import java.util.ArrayList;
import java.util.Arrays;

import javax.sound.midi.Soundbank;

public class Ex01 {

	public static void main(String[] args) {
		solution("afgsdghsghdfrtghsr", 6);

	}//main
	
	 public static ArrayList solution(String my_str, int n) {
	      ArrayList list = new ArrayList();

	      int i = 0;
	      String str = null;
	      try {
	         while(true) {
	            str = my_str.substring(i*n, (i+1)*n);
	            //System.out.println(i + " : " + str);
	            list.add(str);
	            i++;
	         } // while
	      } catch (StringIndexOutOfBoundsException e) {
	         str = my_str.substring(i*n);
	         if(str.length() != 0) {
	         //System.out.println(i + " : " + str);
	         list.add(str);
	         }
	      }
	      
	      //String[] -> ArrayList 변환(검색)

	        // ArrayList -> String [] 변환
	      String [] answer =  (String[]) list.toArray(new String[list.size()]);
	      System.out.println(Arrays.toString(answer));

	        return list;
	    }

}//class
	
