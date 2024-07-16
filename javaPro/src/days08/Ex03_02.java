package days08;

import java.util.Calendar;

/**
 * @author dkrkdfla
 * @date 2024. 7. 10. - 오전 11:24:11
 * @subject
 * @content
 *
 */
public class Ex03_02 {

	public static void main(String[] args) {
		//[주민등록번호]
		//5. 나이(만나이, 세는나이)
		//6. 검증
		
		String rrn = "960501-1234567";
		
		/*
		 * 1. 한국식 나이 = 올해년도 - 출생년도 + 1
		 * 2. 연 나이 = 올해년도 -출생년도
		 * 3. 만 나이 = 올해년도 - 출생년도		생일이 지나지 않으면 -1
		 */
		
		int koreaAge = getKoreaAge(rrn);			//한국식 나이
		System.out.printf(">한국식(세는) 나이 : %d 살.\n", koreaAge);
		int americanAge = getAmericanAge(rrn);		//만 나이
		System.out.printf(">만 나이 : %d 살.\n", americanAge);

	}//main

	//연나이
	private static int getYearAge(String rrn) {
		//"1996년 5월 1일"
		int birthYear = Integer.parseInt( Ex03.getBirthday(rrn).substring(0, 4) );
		Calendar cal = Calendar.getInstance();
		int thisYear = cal.get(Calendar.YEAR);
		
		return thisYear - birthYear;
	}
	
	//한국나이 = 연나이 +1
	private static int getKoreaAge(String rrn) {
		
		
		return getYearAge(rrn) + 1;
	}


	//만나이 = 연나이		-1
	public static int getAmericanAge(String rrn) {
		int americanAge = getYearAge(rrn);
		int thisMonth = 7, thisDay = 10;
		Calendar cal = Calendar.getInstance();
		thisMonth = cal.get(Calendar.MONTH)+1;
		thisDay = cal.get(Calendar.DATE);
		
		int thisMD = 7*100 + 10;      
	     int birthMD = Integer.parseInt( rrn.substring(2, 6) ); 
		if (thisMD < birthMD) {
			americanAge--;
		}
		
		
		return americanAge;
		
	}
	public static String getBirthday(String rrn) {
		// YYMMDD-G
		// "960501-1234567"
		int year =Integer.parseInt( rrn.substring(0, 2) );
		int month = Integer.parseInt( rrn.substring(2, 4) );
		int day = Integer.parseInt( rrn.substring(4, 6) );
		
		
		String gender = getGender(rrn);	// "1900/남/외국인"
		
		int centry = Integer.parseInt(  gender.split("/")[0]  );
		
		year =centry + year;		//1996
		
		//->"1996년 5월 1일"
		String birthday = String.format("%d년 %d월%d일", year, month, day);
		return birthday;
	}

	public static String getGender(String rrn) {
		// "1900/남/외국인"
		// YYMMDD-G
		// "960501-1234567"
		int gender = Integer.parseInt( rrn.substring(7, 8) );	//1
		
		char 성별 = gender%2==0 ? '여' : '남';
		String 국적 = "내국인";
		//[5-8]
		if( 5<= gender && gender <=8) 국적 = "외국인";
		
		int 세기 = 1800;
		switch (gender) {
		case 1: case 2: case 5: case 6:
			세기 = 1900;
			break;
		case 3: case 4: case 7: case 8:
			세기 = 2000;
			break;
		default:
			세기 = 1800;
			break;
		}
		
		return String.format("%d/%c/%s", 세기, 성별, 국적);
	}

}//class




/*
int year =Integer.parseInt( rrn.substring(0, 2) );
int month = Integer.parseInt( rrn.substring(2, 4) );
int day = Integer.parseInt( rrn.substring(4, 6) );

Calendar cal = Calendar.getInstance();
int thisYear = cal.get(Calendar.YEAR);
int thisMonth = cal.get(Calendar.MONTH);
int thisDay = cal.get(Calendar.DATE);

if (month<thisMonth || month==thisMonth && day<thisDay) {
	return	getYearAge(rrn) - 1;
}

return getYearAge(rrn)-2;
*/


/*
//만나이 = 연나이		-1
private static int getAmericanAge(String rrn) {
	int americanAge = getYearAge(rrn);
	//int thisMonth, thisDay;
	int birthMonth, birthDay;
	birthMonth = Integer.parseInt( rrn.substring(2, 4) );
	birthDay = Integer.parseInt( rrn.substring(4, 6) );
	
	Calendar cal = Calendar.getInstance();
	int thisMonth = cal.get(Calendar.MONTH);
	int thisDay = cal.get(Calendar.DATE);
	
	//1풀이
//	if (thisMonth < birthMonth) {
//		americanAge--;
//	} else if (thisMonth==birthMonth && thisDay<birthDay) {
//		americanAge--;
//	}
	
	//2.풀이
//	if (!(thisMonth>birthMonth || thisMonth==birthMonth && thisDay>birthDay)) {
//		americanAge--;
//	}
	
	return americanAge;
	
}
*/



