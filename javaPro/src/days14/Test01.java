package days14;

public class Test01 {

	public static void main(String[] args) {
		//6. [취업 문제] ego(자아)
		  String n = "keNik";   
		  String m= "kKnie";   
		  
//		  위의 두 문자열 n, m 이 알파벳과 알파벳갯수가 똑같은지 비교하는 코딩 
//		  결과는 같을 경우 true/ 다를 경우 false 로 출력.
//		  조건) 대소문자는 구분하지 않는다.    
		  
		
		 boolean comp = false;
		 if (n.length() == m.length()) {
			 System.out.print("알파벳 갯수 같음!\t");
			System.out.println(!comp);
		}else {
			System.out.print("알파벳 갯수 다름!\t");
			System.out.println(comp);
		}//if else
		 
//		 n.compareToIgnoreCase(m);
//		 System.out.println( n.compareToIgnoreCase(m));
		 
		 boolean alcomp = false;
		 if (n.compareToIgnoreCase(m) ==0) {
			 System.out.print("알파벳 같음!\t");
			System.out.println(!alcomp);
		}else {
			System.out.print("알파벳 다름!\t");
			System.out.println(alcomp);
		}
		 

	}//main

}//class
