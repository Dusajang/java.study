package days08;

public class Test02 {

	public static void main(String[] args) {
//		5. 알파벳 대문자, 소문자를 아래와 같이 출력되도록 코딩하세요.
//		[실행결과]
//		 1: A(065)B(066)C(067)D(068)E(069)F(070)G(071)H(072)I(073)J(074)
//		 2: K(075)L(076)M(077)N(078)O(079)P(080)Q(081)R(082)S(083)T(084)
//		 3: U(085)V(086)W(087)X(088)Y(089)Z(090)a(097)b(098)c(099)d(100)
//		 4: e(101)f(102)g(103)h(104)i(105)j(106)k(107)l(108)m(109)n(110)
//		 5: o(111)p(112)q(113)r(114)s(115)t(116)u(117)v(118)w(119)x(120)
//		 6: y(121)z(122) 
		/*
		for (int i = 'A'; i <= 'Z'; i++) {
			System.out.printf("%c(%03d)",i,i);
			if (i%10==4) System.out.println();
		}
		for (int i = 'a'; i <= 'z'; i++) {
			System.out.printf("%c(%03d)",i,i);
			if (i%10==0) System.out.println();
		}
		*/

				for (int i = 'A', count = 1, lineNumber = 1; i <='z'; i++) {
					if (i>'Z' && i<'a') continue;
					if(count%10==1) System.out.printf("%d", lineNumber++);
					System.out.printf("%c(%03d)",i,i);
					/*
					if (대문자 && i%10==4) {
						
					}else if (소문자 && i%10==0) {
						
					}
					*/
					if (count++ %10 ==0) System.out.println();
					
				}//for
	}//main

}//class
