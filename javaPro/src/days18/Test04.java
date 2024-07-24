package days18;

import java.util.Calendar;

public class Test04 {

	public static void main(String[] args) {
		/*
		4. 설문조사 기간이 
		   시작일  2024.7.20  00:00:00
		   종료일  2024.7.24  00:00:00
		   일 때  오늘 현재 설문이 가능/불가능한지를 체크해서 출력하세요.
		   */
		Calendar start = Calendar.getInstance();
		Calendar end = Calendar.getInstance();
		Calendar today = Calendar.getInstance();
		
		start.set(2024, 7, 20, 0, 0, 0);
		end.set(2024, 7, 24, 0, 0, 0);
		today.set(2024, 7, 24, 9, 0, 0);
		
		long startms=0, endms=0, todayms=0;
		
		startms = start.getTimeInMillis();
		endms = end.getTimeInMillis();
		todayms = today.getTimeInMillis();
		
		if (todayms < startms) {
			System.out.println("설문조사 불가, 기간 전");
		} else if (todayms > endms) {
			System.out.println("설문조사 불가, 기간 후");
		}else {
			System.out.println("설문조사 가능");
		}

	}//main

}//class
