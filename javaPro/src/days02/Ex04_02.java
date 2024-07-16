package days02;



/**
 * @author dkrkdfla
 * @date 2024. 7. 2. - 오후 2:36:02
 * @subject (암기) 두 기억공간의 값을 바꾸기
 * @content
 *
 */
public class Ex04_02 {

	public static void main(String[] args) {
		/*
		 * int x = 10;
		 * int y =20;
		 */
		
		//콤마연산자
		int x = 10, y = 20;
		
		//두 기억공간의 값을 바꾸기 -> 임시기억공간이 필요
		{
			int temp;   //10
			temp = x;
			x = y;       //20
			y = temp; //10
		}
		

	}//main

}//class
