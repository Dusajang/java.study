
package week02;

import java.util.Arrays;
import java.util.Random;

public class Week02_Review04 {

	static int[][] classRanks = new int[3][30];
	static int[][] schoolRanks = new int[3][30];
	static int[] schoolRanksCnt = new int[90];
	static int[] schooltots =new int [90];
	
	public static void main(String[] args) {
		// 4. 30명 3반 학생의 이름,국,영,수,총,평,등,전교등수를 입력 및 출력하는 코딩.
		
		String name;
		int kor, eng, mat, tot;
		double avg;
		
		
		String[][] stuNames = new String[3][30];
		int[][] kors = new int [3][30];
		int[][] engs = new int [3][30];
		int[][] mats = new int [3][30];
		int[][] tots = new int [3][30];
		double[][] avgs = new double [3][30];
		
		
		
		
		
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 30; j++) {
				stuNames[i][j] = getName();
				kors[i][j] = getScore();
				engs[i][j] = getScore();
				mats[i][j] = getScore();
				tots[i][j] = kors[i][j] + engs[i][j]+mats[i][j];
				avgs[i][j] = (double )(kors[i][j] + engs[i][j]+mats[i][j])/3;

			}
		}
		getClassRanks(tots);
		getSchoolRanks(tots);
		
		for (int i = 0; i < tots.length; i++) {
			System.out.println();
			System.out.printf("%d반\n", i+1);
			for (int j = 0; j < tots[i].length; j++) {

				System.out.printf("이름 : %s\t 국어 : %d\t 영어 : %d\t 수학 : %d\t 총점 :%d\t 평균 : %.2f\t 반 등수 : %d등\t 전교등수 : %d\n",
												stuNames[i][j], kors[i][j], engs[i][j], mats[i][j], tots[i][j], avgs[i][j], classRanks[i][j], schoolRanks[i][j]);
//				System.out.printf("%s\t %d\t %d\t %d\t %d\t %.2f\t %d\t %d\n",
//						stuNames[i][j], kors[i][j], engs[i][j], mats[i][j], tots[i][j], avgs[i][j], classRanks[i][j], schoolRanks[i][j]);
			}
		}
		

	}//main
	


	private static void getSchoolRanks(int[][] tots) {
		for (int i = 0; i < tots.length; i++) {
			for (int j = 0; j < tots[i].length; j++) {
				schooltots[(i*30)+j] = tots[i][j];
			}
		}
		
		for (int i = 0; i < schooltots.length; i++) {
			for (int j = 0; j <= i; j++) {
				if (schooltots[i] <= schooltots[j]) {
					schoolRanksCnt[i]++;
				}
				if (schooltots[i] > schooltots[j]) {
					schoolRanksCnt[j]++;
				}
			}
		}
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 30; j++) {
				schoolRanks[i][j] = schoolRanksCnt[(i*30)+j];
			}
		}
		
	}//getSchoolRanks



	private static void getClassRanks(int[][] tots) {
	for (int k = 0; k < tots.length; k++) {
		for (int i = 0; i < tots[k].length; i++) {
			for (int j = 0; j <=i; j++) {
				if (tots[k][i]<=tots[k][j]) { 
					classRanks[k][i]++;
				}
				if (tots[k][i]>tots[k][j]) {
					classRanks[k][j]++;
				}
			}
		}
	}	
		
	}//getClassRanks



	private static int getScore() {
		int score = (int) (Math.random()*101);
		return score;
	}


	public static String getName() {
		Random rnd = new Random();
		String[] lastNames = {"김", "이", "박", "최", "권", "홍"};
		int index = rnd.nextInt(lastNames.length);
		String name = lastNames[index];
		
		//이름 2문자
		char[] firstNames = new char[2];
		for (int i = 0; i < firstNames.length; i++) {
			firstNames[i] = (char) (rnd.nextInt('힣'-'가'+1) + '가');
		}
		String firstName = String.valueOf(firstNames);
		
		name +=firstName;
		
		return name;
	}

}//class
