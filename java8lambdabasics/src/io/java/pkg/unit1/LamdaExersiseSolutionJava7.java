package io.java.pkg.unit1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class LamdaExersiseSolutionJava7 {

	public static void main(String[] arg) {
		List<Person> personList = Arrays.asList(new Person("Sumanta", "Laha", 31), new Person("Nayan", "SAHA", 45),
				new Person("Aliisan", "ghosh", 67), new Person("Hyder", "halder", 78));
		Collections.sort(personList, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				// TODO Auto-generated method stub
				return (o1.getFirstName().compareToIgnoreCase(o2.getFirstName()));

			}
		});
		
		printAll(personList);
		System.out.println("--------------sort by first name----------------------");
		Collections.sort(personList, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				// TODO Auto-generated method stub
				return (o1.getLastName().compareToIgnoreCase(o2.getLastName()));

			}
		});
		
		printAll(personList);
		System.out.println("--------------sort by Last name----------------------");
		printcondionally(personList, new Condition() {

			@Override
			public boolean check(Person p) {
				// TODO Auto-generated method stub
				return (p.getAge() > 50);
			}
		});
		System.out.println("--------------Filter by AGE----------------------");

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

	private static void printAll(List<Person> personList) {
		// TODO Auto-generated method stub
		Iterator<Person> personIT = personList.iterator();
		while (personIT.hasNext()) {
			Person p = personIT.next();
			System.out.println(p);
		}

	}

}


