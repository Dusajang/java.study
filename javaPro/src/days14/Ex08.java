package days14;

/**
 * @author dkrkdfla
 * @date 2024. 7. 18.오후 2:08:22
 * @subject
 * @content
 *
 */
public class Ex08 {

	public static void main(String[] args) {
		
		/*
		 * 						[상속 계층도]
		 * 								Object
		 * 	   ↑											 ↑
		 * Point									 shape 도형클래스
		 * 												 ↑
		 * 											Circle 원, Triangle 삼각형
		 * 
		 * is-a 관계
		 * 원은 도형이다
		 * 삼각형은 도형이다
		 */
		
		//Point p = new Point(1,2);
		
		

	}//main

}//class

class Shape{
	String color = "black";
	
	void draw() {
		System.out.printf("[color=%s]\n", this.color);
	}
	
	void 면적계산() {
		
	}
}//Shape

class Circle extends Shape{
	// 원점 반지름
	Point center;  //has-a
	int r;  //radius
	
	Circle(){
		this(0,0,0);
	}
	Circle(int x, int y, int r){
		this.center = new Point(x,y);
		this.r = r;
	}
	Circle(Point center, int r){
		this.center = center;
		this.r = r;
	}
	
	@Override
	void 면적계산() {  //더 큰 범위의 접근지정자는 앞에 붙일 수 있음
		//반지름^2 * 3.14
		
	}	
	
	
}

class Triangle extends Shape{
	
	Point[] p = null;
	
	public Triangle(Point [] p) {
		this.p = p;
	}
	@Override
	void 면적계산() {  //더 큰 범위의 접근지정자는 앞에 붙일 수 있음
		//가로*세로*1/2
		
	}	
	
}





