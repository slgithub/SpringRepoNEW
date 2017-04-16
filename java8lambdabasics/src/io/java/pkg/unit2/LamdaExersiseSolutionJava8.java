package io.java.pkg.unit2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import io.java.pkg.unit1.Person;

public class LamdaExersiseSolutionJava8 {

	public static void main(String[] arg) {
		List<Person> personList = Arrays.asList(new Person("Sumanta", "Laha", 31), new Person("Nayan", "SAHA", 45),
				new Person("Aliisan", "ghosh", 67), new Person("Hyder", "halder", 78));
		
		Collections.sort(personList, (p1,p2)-> p1.getFirstName().compareToIgnoreCase(p2.getFirstName()));
		
		printcondionally(personList,p -> true,p-> System.out.println(p));
		System.out.println("--------------sort by first name with LAMBDA----------------------");
		Collections.sort(personList, (p1,p2)-> p1.getLastName().compareToIgnoreCase(p2.getLastName()));
		
		printcondionally(personList,p -> true,p-> System.out.println(p));
		System.out.println("--------------sort by Last name with LAMBDA----------------------");
		printcondionally(personList,p-> p.getAge() > 50,p-> System.out.println(p.getFirstName()));
		System.out.println("--------------Filter by AGE with LAMBDA----------------------");

	}

	private static void printcondionally(List<Person> personList, Predicate<Person> condition,Consumer<Person> consumer) {
		// TODO Auto-generated method stub
		Iterator<Person> personIT = personList.iterator();
		while (personIT.hasNext()) {
			Person p = personIT.next();
			if (condition.test(p))
				consumer.accept(p);
		}
	}

}
