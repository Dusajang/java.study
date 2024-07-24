package days18;

import java.text.MessageFormat;
import java.text.ParseException;

public class Ex02_05 {

	public static void main(String[] args) throws ParseException {

		//String s = "[팀장]김재민(전), 김선우(전), 김인경(비),  송세호(비), 전재윤(전)";
		String ouput = "이름:권맑음, 나이:26살, 성별:남자, 키:178.67 입니다";
		
		String pattern = "이름:{0}, 나이:{1}살, 성별:{2}, 키:{3} 입니다";
		MessageFormat mf = new MessageFormat(pattern);
		Object[] objs = mf.parse(ouput);
		for (Object v : objs) {
			System.out.println(v);

		}
	}

}
