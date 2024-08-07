package days17;

import java.util.Calendar;

public class Ex09 {

	public static void main(String[] args) {
		//jdk 1.0    java.util.Date 클래스
		//                        ㄴjava.sql.Date
		
		//jdk 1.1    java.util.Calendar 클래스
		
		Calendar c = Calendar.getInstance();    // 그레고리력에서 업캐스팅
		//System.out.println(c.toString());
		//년
		System.out.println(Calendar.YEAR);
		System.out.println(c.get(1));
		System.out.println(c.get(Calendar.YEAR));
		//월
		System.out.println(c.get(Calendar.MONTH)+1);
		//일
		System.out.println(c.get(Calendar.DATE));
		System.out.println(c.get(Calendar.DAY_OF_MONTH));
		System.out.println(c.get(Calendar.DAY_OF_WEEK));
		//시간
		System.out.println(c.get(Calendar.HOUR));                     //12시간
		System.out.println(c.get(Calendar.HOUR_OF_DAY));        //24시간
		//분
		System.out.println(c.get(Calendar.MINUTE));
		//초
		System.out.println(c.get(Calendar.SECOND));
		//밀리초
		System.out.println(c.get(Calendar.MILLISECOND));
		//요일
		//Date         0일요일 ~ 6토요일
		//Calendar   1일요일 ~ 7토요일
		System.out.println("월화수목금토일".charAt(c.get(Calendar.DAY_OF_WEEK)));
		// 오전 오후
		System.out.println("월화수목금토일".charAt(c.get(Calendar.AM)));
		System.out.println("월화수목금토일".charAt(c.get(Calendar.AM_PM)));
		//마지막 날짜
		System.out.println(c.getActualMaximum(Calendar.DAY_OF_MONTH));
		
		

	}//main


}//class






