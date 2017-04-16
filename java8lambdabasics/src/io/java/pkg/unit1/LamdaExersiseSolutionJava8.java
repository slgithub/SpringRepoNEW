package io.java.pkg.unit1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class LamdaExersiseSolutionJava8 {

	public static void main(String[] arg) {
		List<Person> personList = Arrays.asList(new Person("Sumanta", "Laha", 31), new Person("Nayan", "SAHA", 45),
				new Person("Aliisan", "ghosh", 67), new Person("Hyder", "halder", 78));
		
		Collections.sort(personList, (p1,p2)-> p1.getFirstName().compareToIgnoreCase(p2.getFirstName()));
		
		printcondionally(personList,p -> true);
		System.out.println("--------------sort by first name with LAMBDA----------------------");
		Collections.sort(personList, (p1,p2)-> p1.getLastName().compareToIgnoreCase(p2.getLastName()));
		
		printcondionally(personList,p -> true);
		System.out.println("--------------sort by Last name with LAMBDA----------------------");
		printcondionally(personList,p-> p.getAge() > 50);
		System.out.println("--------------Filter by AGE with LAMBDA----------------------");

	}

	private static void printcondionally(List<Person> personList, Condition condition) {
		// TODO Auto-generated method stub
		Iterator<Person> personIT = personList.iterator();
		while (personIT.hasNext()) {
			Person p = personIT.next();
			if (condition.check(p))
				System.out.println(p);
		}
	}

}
