package review01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Review01 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String name;
		byte age;
		
		System.out.print("> 이름?");
		name = br.readLine();
		
		System.out.print("> 나이?");
		age = Byte.parseByte(br.readLine());
		
		System.out.printf("이름 : \"%s\", 나이 : %d" , name, age);

	}



}
