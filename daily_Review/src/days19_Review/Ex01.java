package days19_Review;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex01 {

	public static void main(String[] args) {
		

	}//main
	
	public static ArrayList solution(String my_str, int n) {
		ArrayList list = new ArrayList();
		
		int i = 0;
		String str = null;
		
		try {
			while (true) {
				str = my_str.substring(i*n, (i+1)*n);
				list.add(str);
				i++;	
			}
		} catch (StringIndexOutOfBoundsException e) {
			str = my_str.substring(i*n);
			if (str.length() !=0 ) {
				list.add(str);
			}
		}
		String[] answer = (String[]) list.toArray(new String[list.size()]);
		System.out.println(Arrays.toString(answer));
		return list;
	}
	

}//class
