package com.util;

public class Draw2D {
	public static void drawLine(){
		System.out.println("---------------");
	}

	public static void drawLine(int length){
		for (int i = 0; i < length; i++) {
			System.out.print("-");
		}
		System.out.println();
	}

	public static void drawLine(char style, int length){
		for (int i = 0; i < length; i++) {
			System.out.print(style);
		}
		System.out.println();
	}

}
