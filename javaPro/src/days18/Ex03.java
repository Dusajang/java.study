package days18;

/**
 * @author dkrkdfla
 * @date 2024. 7. 24.오전 11:50:36
 * @subject
 * @content
 *
 */
public class Ex03 {

	public static void main(String[] args) {
		/* jdk 1.0 java.util.Data
		 * jdk 1.1 java.util.Calendar
		 * 
		 * SDF, DF, CF, MF 형식화  클래스
		 * 
		 * [jdk 1.8에 새로 추가된 날짜, 시간 클래스]
		 * 1. java.time
		 *  ㄴjava.time.chrono : 표준(ISO)이 아닌 달력 시스템을 위한클래스 제공
		 *  ㄴjava.time.format : 형식화(파싱) 클래스 제공
		 *  ㄴjava.time.temporal : 날짜, 시간의 필드와 단위 클래스 제공
		 *  ㄴjava.time.zone : 시간대(time-zone) 클래스 제공
		 * 
		 * 2. java.time : 날짜, 시간을 다루는 핵심 클래스
		 *   1) 날짜 : LocalDate
		 *   2) 시간 : LocalTime
		 *   3) 날짜 +시간 : LocalDateTime
		 *   4) 날짜 +시간+시간대 : ZoneDateTime
		 *      -> Temporal, TemporalAdjuster 인터페이스 구현
		 *      
		 * 3. Period     = 날짜와 날짜 사이의 간격
		 *     Duration  = 시간과 시간 사이의 간격
		 *       -> TemporalAmount 인터페이스 구현
		 * 4. java.time 핵심클래스     new 객체 생성 X
		 *      : of(), now() 로 생성 
		 *      
		 * 5. 날짜+시간의 단위를 정의해 놓은 인터페이스 : TemporalUnit
		 *     위의 인터페이스를 구현한 클래스              : ChronoUnit
		 *     
		 * 6. 날짜+시간의 필드(field)를 정의해 놓은 인터페이스 : TemporalField
		 *                                                                : ChronoUnit
		 * 7. 특정 필드(년, 월, 시, 분 등등) 얻어올 때
		 *     get(년도), getYear()
		 *     get(월),   getMonth()
		 * 8.특정 필드(년, 월, 시, 분 등등)를 수정
		 *   with()
		 *   plus()
		 *   minus()
		 *   roll() / add()
		 */

	}//main

}//class












