package days19;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.function.Predicate;

import lombok.AllArgsConstructor;
import lombok.Data;

public class Test01 {

	public static void main(String[] args) {
/*
		ArrayList list = new ArrayList();
		list.add(new Person("송세호"), 20);
		list.add(new Person("송세호"), 22);
		list.add(new Person("송세호"), 25);
		list.add(new Person("송세호"), 35);
		
		
		list.sort(new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				// TODO Auto-generated method stub
				return o1.getName().compareTo(o2.getName());
			}
		});
		
		
		list.sort((Person o1, Person o2) -> ){
			return o1.getName().compareTo(o2.getName());
		}
		
		Iterator<E>
*/

	}//main

}//class

@Data
@AllArgsConstructor
class Person{
	private String name;
	private int age;
}





