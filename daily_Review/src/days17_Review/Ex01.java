package days17_Review;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;

public class Ex01 {

	public static void main(String[] args) {
		// 파일을 읽어와서 출력하기
		String fileName = "SS21_Team.txt";
		
		String myName = "송세호";
		String teamLeader = null;
		String teamLine = null;
		String teamMemberLine = null;
		String [] teamMember = null;     //팀원을 저장할 배열
		String regex = "\\s*,\\s*";
		
		String key = "user.dir";
		String userDir = System.getProperty(key);
		
		fileName = String.format("%s\\src\\days17\\%s", userDir, fileName); 
		
		try (
				FileReader reader = new FileReader(fileName);
				BufferedReader br = new BufferedReader(reader);
				){
			while ((teamLine = br.readLine()) != null) {
				teamMemberLine = br.readLine();
				
				if(teamMemberLine.contains(myName)) {
					break;
				}//if
			}//while'
			teamMember = teamMemberLine.split(regex);
			String prefix = "[팀장]";
			for (int i = 0; i < teamMember.length; i++) {
				if (  teamMember[i].trim().startsWith(prefix)  )  teamLeader = teamMember[i].trim().replace(prefix,"");
			}
			String [] temp = new String[teamMember.length-1];    // 팀장을 제외한 인원 배열에 넣기
			System.arraycopy(teamMember, 1, temp, 0, teamMember.length-1);  //teamMember의 1번째부터, temp의 0번째부터 배열 길이 -1까지
			Arrays.sort(temp);
			System.arraycopy(temp, 0, teamMember, 1, temp.length);
			
			// 배열 정렬, temp s1과 s2를 -> 내림차순으로 비교 정렬
			Arrays.sort(temp, (s1,s2)-> s2.compareTo(s1)); // *****
			
			StringBuilder sb = new StringBuilder(teamLine+"\n");
			sb.append("<ul>\n");
			sb.append("\t<li class=\"leader\">" +teamLeader+ "</li>\n");
			sb.append("\t<li>");
			sb.append(  String.join("</li>\n\t<li>", temp)  );
			 sb.append("</li>\n</ul>\n");
			System.out.println(sb.toString());
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	

	}//main

}//class








