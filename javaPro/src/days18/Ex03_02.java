package days18;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * @author dkrkdfla
 * @date 2024. 7. 24.오후 12:13:08
 * @subject
 * @content
 *
 */
public class Ex03_02 {

	public static void main(String[] args) {
		
		LocalDate ld = LocalDate.now();
		//System.out.println(ld.toString());
		LocalDate ld2 = LocalDate.of(2024, 7, 24);
		System.out.println(ld2);
		
		
		
		LocalTime lt = LocalTime.now();
		System.out.println(lt); //12:16:45.826091900
		LocalTime lt2 = LocalTime.of(12, 16, 32);
		System.out.println(lt2);
		
		
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);  //2024-07-24T12:18:23.677457100
		
		LocalDateTime ldt2 = LocalDateTime.of(ld, lt);
	}

}
