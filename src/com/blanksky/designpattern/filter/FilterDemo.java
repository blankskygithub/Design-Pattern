package com.blanksky.designpattern.filter;

import java.util.ArrayList;
import java.util.List;

public class FilterDemo {

	public static void main(String[] args) {
		List<Person> persons = new ArrayList<Person>();
		
		persons.add(new Person("Robert", "male", "single"));
		persons.add(new Person("John", "male", "Married"));
		persons.add(new Person("Laura", "female", "married"));
		persons.add(new Person("Diana", "female", "single"));
		persons.add(new Person("Mike", "male", "single"));
		persons.add(new Person("Bobby", "male", "single"));
		
		Criteria male = new CriteriaMale();
		Criteria female = new CriterialFemale();
		Criteria single = new CriteriaSingle();
		Criteria singleFemale = new AndCriteria(single, female);
		Criteria singleOrMale = new OrCriteria(single, male);
		
		System.out.println("Male: ");
		printPersons(male.meetCriteria(persons));
		
		System.out.println("Female: ");
		printPersons(female.meetCriteria(persons));
		
		System.out.println("Single: ");
		printPersons(single.meetCriteria(persons));
		
		System.out.println("Singele and Male: ");
		printPersons(singleFemale.meetCriteria(persons));
		
		System.out.println("Single or Male: ");
		printPersons(singleOrMale.meetCriteria(persons));

	}
	
	public static void printPersons(List<Person> persons){
		String personInfo;
		if(persons.size()!=0){
			for(Person person : persons){
				personInfo = "Person: [Name:"+person.getName()+",Gender:"+person.getGender()+",Marital Status:"+person.getMaritalStatus()+"]";
				System.out.println(personInfo);
			}
		}
	}

}
