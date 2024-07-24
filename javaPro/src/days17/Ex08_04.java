package days17;

import java.util.Date;

/**
 * @author dkrkdfla
 * @date 2024. 7. 23.오후 4:17:50
 * @subject
 * @content
 *
 */
public class Ex08_04 {

	public static void main(String[] args) {
		// 개강일로부터 지금(현재)까지 지난 일수를 계산.
		Date o = new Date(2024-1900, 7-1, 1, 9, 0, 0);
		//System.out.println(o.toLocaleString());

		Date t = new Date();
		//System.out.println(t.toLocaleString());

		long diffms = t.getTime() - o.getTime();
		System.out.println(diffms+"ms");
		System.out.println(diffms/1000+"s");
		System.out.println(diffms/1000/60+"min");
		System.out.println(diffms/1000/60/60+"hour");
		System.out.println(diffms/1000/60/60/24+"day");

		//		int pastDay = (int) (diffms/1000/60/60/24);
		//		int pastHour = (int) (diffms/1000/60/60);
		//		int pastMin = (int) (diffms/1000/60);

		d_day(t, o);




	}//main

	private static void d_day(Date t, Date o) {
		long diffms = t.getTime() - o.getTime();
		
		long [] tArr = {1000*60*60*24, 1000*60*60, 1000*60, 1000};

		long d = diffms / (1000*60*60*24);
		diffms = diffms % (1000*60*60*24);
		System.out.print(d+"d ");

		long h = diffms / (1000*60*60);
		diffms = diffms % (1000*60*60);
		System.out.print(h+"h ");

		long m = diffms / (1000*60);
		diffms = diffms % (1000*60);
		System.out.print(m+"m ");

		long s = diffms / (1000);
		long ms = diffms % (1000);
		System.out.print(s+"s " + ms + "ms");
		
		try {
	         System.out.println("\n\n\n\n");
	         Thread.sleep(10);
	         
	         //d_day(new Date(), o);
	         
	      } catch (InterruptedException e) { 
	         e.printStackTrace();
	      }


	}

}//class









