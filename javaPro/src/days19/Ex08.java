package days19;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) throws IOException {
		final int CLASS_COUNT = 3;

		// 각 반의 학생 리스트를 저장할 ArrayList 생성
		ArrayList classList = new ArrayList(CLASS_COUNT);
		int i = 0;
		while (i < CLASS_COUNT) {
			classList.add(new ArrayList());  // 각 반마다 ArrayList 추가
			i++;
		}

		char con = 'y';  // 입력을 계속할지 여부를 묻기 위한 변수
		Scanner scanner = new Scanner(System.in);

		int ban; // 1반, 2반, 3반 중 하나
		do {
			System.out.printf(">반 입력: ");
			ban = scanner.nextInt();  // 반 입력

			System.out.printf(">%d반의 [%d]번 학생 이름, 국어, 영어, 수학 입력: ", ban, ((ArrayList) classList.get(ban - 1)).size() + 1);

			// 학생 정보 입력
			String name = getName();
			int kor = getScore();
			int eng = getScore();
			int mat = getScore();
			int tot = kor + eng + mat;
			double avg = (double) tot / 3;

			// 학생 정보를 저장할 ArrayList 생성
			ArrayList student = new ArrayList();
			student.add(name);
			student.add(kor);
			student.add(eng);
			student.add(mat);
			student.add(tot);
			student.add(avg);
			student.add(1); // rank (초기 값)
			student.add(1); // wrank (초기 값)

			// 해당 반의 학생 리스트에 학생 정보 추가
			((ArrayList) classList.get(ban - 1)).add(student);

			// 입력 계속 여부 묻기
			System.out.print(">입력 계속? (y/n): ");
			con = (char) System.in.read();
			System.in.skip(System.in.available());
		} while (Character.toUpperCase(con) == 'Y');

		// 반 등수 계산
		for (i = 0; i < classList.size(); i++) {
			ArrayList students = (ArrayList) classList.get(i);
			Collections.sort(students, new Comparator() {
				public int compare(Object o1, Object o2) {
					return ((Integer) ((ArrayList) o2).get(4)).compareTo((Integer) ((ArrayList) o1).get(4));
				}
			});
			for (int j = 0; j < students.size(); j++) {
				((ArrayList) students.get(j)).set(6, j + 1); // 반 등수 저장
			}
		}

		// 전교 등수 계산
		ArrayList allStudents = new ArrayList();
		for (i = 0; i < classList.size(); i++) {
			allStudents.addAll((ArrayList) classList.get(i));
		}
		Collections.sort(allStudents, new Comparator() {
			public int compare(Object o1, Object o2) {
				return ((Integer) ((ArrayList) o2).get(4)).compareTo((Integer) ((ArrayList) o1).get(4));
			}
		});
		for (i = 0; i < allStudents.size(); i++) {
			((ArrayList) allStudents.get(i)).set(7, i + 1); // 전교 등수 저장
		}

		// 총 학생 수 계산
		int totalStudents = 0;
		for (int j = 0; j < classList.size(); j++) {
			totalStudents += ((ArrayList) classList.get(j)).size();
		}
		System.out.printf("\t\t학생 정보 출력(%d명)\n", totalStudents);

		// 각 반의 학생 정보 출력
		for (int j = 0; j < classList.size(); j++) {
			ArrayList students = (ArrayList) classList.get(j);
			System.out.printf("[%d반 학생 : %d명]\n", j + 1, students.size());

			for (int k = 0; k < students.size(); k++) {
				ArrayList student = (ArrayList) students.get(k);
				System.out.printf("[%d]\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\t%d\n",
						j + 1, (String) student.get(0), (int) student.get(1), (int) student.get(2), (int) student.get(3),
						(int) student.get(4), (double) student.get(5), (int) student.get(6), (int) student.get(7));
			}
		}
	}

	// 랜덤한 이름 생성
	private static String getName() {
		Random rnd = new Random();
		String[] lastNames = {"김", "이", "박", "최", "권", "홍"};
		int index = rnd.nextInt(lastNames.length);
		String name = lastNames[index];

		// 이름 2문자 생성
		char[] firstNames = new char[2];
		for (int i = 0; i < firstNames.length; i++) {
			firstNames[i] = (char) (rnd.nextInt('힣' - '가' + 1) + '가');
		}
		String firstName = String.valueOf(firstNames);

		name += firstName;

		return name;
	}

	// 랜덤한 점수 생성 (0~100)
	public static int getScore() {
		return (int) (Math.random() * 101);
	}
}