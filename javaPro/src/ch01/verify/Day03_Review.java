package ch01.verify;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day03_Review {

	public static void main(String[] args) throws IOException {
		//- BuffereadReader 를 사용해서 이름, 나이 입력받아서 출력.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String name;
		byte age;
		
		System.out.print("이름?");
		name = br.readLine();
		
		System.out.print("나이?");
		age = Byte.parseByte(br.readLine());
		
		System.out.printf("이름 : %s, 나이 : %d.", name, age);

	}

}
