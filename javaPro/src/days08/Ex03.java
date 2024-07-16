package days08;

/**
 * @author dkrkdfla
 * @date 2024. 7. 10. - 오전 11:24:11
 * @subject
 * @content
 *
 */
public class Ex03 {

	public static void main(String[] args) {
		//[주민등록번호]
		//住民登錄番號 / Resident registration number, RRN
		//1. 생년월일
		//2. 성별
		//3. 내국인/외국인
		//4. 출신지역 x
		//5. 나이(만나이, 세는나이)
		//6. 검증
		
		String rrn = "960501-1234567";
		
		//생년월일 가져오기
		//->"1996년 5월 1일"
		String birthday = getBirthday(rrn);
		System.out.println(birthday);
		
		String gender = getGender(rrn).split("/")[1];
		System.out.println(gender);
		
		String nationality = getGender(rrn).split("/")[2];
		System.out.println( nationality );
		

	}//main

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








