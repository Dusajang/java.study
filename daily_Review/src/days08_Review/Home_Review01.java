package days08_Review;

import java.util.Calendar;
import java.util.Scanner;

public class Home_Review01 {

	public static void main(String[] args) {
		//1. 주민등록 번호를 입력받아서 만 나이를 계산하는 메서드 선언
		//960501-1234567
		System.out.println(">주민번호 13자리를 입력하세요. ('-'포함)");
		Scanner scanner = new Scanner(System.in);
		String rrn = scanner.nextLine();
		
		int bYear = Integer.parseInt( rrn.substring(0, 2) );
		int bMonth = Integer.parseInt( rrn.substring(2, 4) );
		int bDate = Integer.parseInt( rrn.substring(4, 6) );
		int gender = Integer.parseInt( rrn.substring(7, 8) );
		
		int birthYear = getBirthYear(rrn);
		
		int korAge = getKorAge(rrn);
		
		int amercanAge = getAmericanAge(rrn);
		
		
		System.out.printf("출생년도 : %d\n", birthYear);
		System.out.printf("한국식 나이 : %d\n", korAge);
		System.out.printf("만 나이 : %d\n", amercanAge);
		//americanAge();
		
		
		

	}//main

	
	public static int getAmericanAge(String rrn) {
//		int bYear = Integer.parseInt( rrn.substring(0, 2) );
		int bMonth = Integer.parseInt( rrn.substring(2, 4) );
		int bDate = Integer.parseInt( rrn.substring(4, 6) );
//		int gender = Integer.parseInt( rrn.substring(7, 8) );
		
		Calendar cal = Calendar.getInstance();
//		int thisYear = cal.get(Calendar.YEAR);
		int thisMonth = cal.get(Calendar.MONTH)+1;;
		int thisDate = cal.get(Calendar.DATE);
		
		int AmericanAge;
		if (bMonth < thisMonth ||(bMonth == thisMonth && bDate < thisDate) ) {
			AmericanAge = getYearAge(rrn);
		} else {
			AmericanAge = getYearAge(rrn)-1;
		}
		return AmericanAge;
	}

	
	public static int getKorAge(String rrn) {
		
		return getYearAge(rrn) + 1;
	}


	public static int getYearAge(String rrn) {
		Calendar cal = Calendar.getInstance();
		int thisYear = cal.get(Calendar.YEAR);
//		int thisMonth = cal.get(Calendar.MONTH)+1;;
//		int thisDate = cal.get(Calendar.DATE);
		
		int yearAge = thisYear - getBirthYear(rrn);
		return yearAge;	
	}

	public static int getBirthYear(String rrn) {
		int bYear = Integer.parseInt( rrn.substring(0, 2) );
//		int bMonth = Integer.parseInt( rrn.substring(2, 4) );
//		int bDate = Integer.parseInt( rrn.substring(4, 6) );
		int gender = Integer.parseInt( rrn.substring(7, 8) );
		
		if (gender==1 || gender==2||gender==5||gender==6) {
			bYear = 1900+bYear;
		}else if (gender==3||gender==4||gender==7||gender==8) {
			bYear = 2000+bYear;
		}else {bYear = 1800+bYear;}
		return bYear;	
	}
	
	
}//class







