package days21;

import java.io.FileWriter;

/**
 * @author dkrkdfla
 * @date 2024. 7. 29.오후 2:28:49
 * @subject
 * @content
 *
 */
public class Ex08 {

	public static void main(String[] args) {
		//  DataInputStream / DataOutputStream
		// 바이트 스트림
		// 기본형 8가지를 읽기/쓰기
		String name = "홍길동";
		int kor=98, eng=89, mat=20;
		int tot = kor+eng+mat;
		double avg = (double)tot/3;
		boolean gender = true;
		
		//student.txt 파일로 저장
		String fileName = ".\\src\\days21\\strudent.txt";
		try (FileWriter writer = new FileWriter(fileName);){
			String info = String.format("%s, %d, %d, %d, %d, %f, %b", name, kor, eng, mat, tot, avg, gender);
			writer.append(info);
			writer.flush();
			System.out.println(info);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(" end ");

	}//main

}//class
