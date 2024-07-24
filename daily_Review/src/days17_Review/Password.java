package days17_Review;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("비밀번호를 입력: ");
        String password = scanner.nextLine();
        
        if (checkPassword(password)) {
            System.out.println("유효한 비밀번호");
        } else {
            System.out.println("유효하지 않은 비빌번호");
        }
        
        scanner.close();
    }
    
    public static boolean checkPassword(String password) {
        // 비밀번호 유효성 검사 regex
        String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[#@$%]).{8,15}$";
        
        // 정규표현식을 사용하여 패턴 매칭
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        
        return matcher.matches();
    }

}
