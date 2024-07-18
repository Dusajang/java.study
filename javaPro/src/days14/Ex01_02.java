package days14;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ex01_02 {

	public static void main(String[] args) {
		//6. [취업 문제] ego(자아)
		String n = "keNik";   
		String m= "kKnie";   

		//InStream
		n = n.toUpperCase()
				.chars()
				.sorted()
				.collect(StringBuilder::new
						, StringBuilder::appendCodePoint
						, StringBuilder::append)
				.toString();

		m = Stream.of(m.toUpperCase().split(""))
				.sorted()
				.collect(Collectors.joining());


	}

}
