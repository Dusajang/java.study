package days11;

import java.util.Arrays;

public class Ex01 {

	public static void main(String[] args) {

		int [] m = {1,2,3,4,5,6};
		int [][] n = new int[2][3];    

		for (int i = 0; i < m.length; i++) {
			System.out.printf("%d-[%d][%d]\n", i, i/(n[0].length), i%(n[0].length) );
			n[i/n[0].length][i%n[0].length] = m[i];
		}
		for (int i = 0; i < n.length; i++) {
			System.out.println(Arrays.toString(n[i]));
		}



		//C:\Users\User>git --version
		//git version 2.45.2.windows.1

		//4. 사용자 정보 설정
		//C:\Users\User>git config --list
		//C:\Users\User>git config --global user.name "seho"
		//C:\Users\User>git config --global user.email "tlswjseks@gmail.com"
		//C:\Users\User>git config -h    도움말
		/*
		 * C:\Users\User>git config user.name
			seho
			C:\Users\User>git config user.email
			tlswjseks@gmail.com

			C:\Users\User>git config --list
			C:\Users\User>git help config
			
			6.github 등록
			7. 비주얼스튜디오 코드 다운로드
			https://visualstudio.microsoft.com/ko/downloads/
			8.Workspace에 GitTest 폴더 생성
				ㄴSiSt 폴더 생성 - 교육원 pc
					ㄴWorkspace
						ㄴJavaClass
				ㄴHome 폴더 생성 - 집 pc
					ㄴWorkspace
						ㄴJavaClass
			9. git hub 원격 저장소 생성 - javaPro
			10.로컬 저장소 커밋
			11.로컬 저장소 ----------> 원격 저장소 저장
			12. 원격 저장소 확인
			12-2. [참고] 원격저장소 변경
					git remote remove origin
					git remote set-url origin https://<토큰 코드>@github.com/<유저네임>/<레포지토리 이름>[참고]
			
			
			
		 */


	}//main

}//class
