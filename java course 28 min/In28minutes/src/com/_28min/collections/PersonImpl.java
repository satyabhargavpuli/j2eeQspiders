package com._28min.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PersonImpl {

	public static void main(String[] args) {
		List<Person> student = List.of(new Person("satya", 2000.0),
				new Person("bhargav", 2200.0),
				new Person("balu", 2400.0)
				);
		List<Person> studental = new ArrayList<>(student);
		
		System.out.println(student);
		Collections.sort(studental);
		System.out.println(studental);
	}
}
