package demo04.handson;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import demo04.common.Gender;
import demo04.common.Person;

public class Solution002 {

	// Suppose this data might be comming from backend app or some REST call
	public static List<Person> createPeople(){
		return Arrays.asList(
				new Person("pankaj", 38, Gender.MALE),
				new Person("Manvi", 6, Gender.FEMALE),
				new Person("Aman", 34, Gender.MALE),
				new Person("Bindu", 23, Gender.FEMALE),
				new Person("Kabir", 45, Gender.MALE),
				new Person("Monika", 45, Gender.FEMALE),
				new Person("Monika", 35, Gender.FEMALE),
				new Person("Vijay", 34, Gender.MALE),
				new Person("Priyanka", 35, Gender.FEMALE));
	}
	
	public static void main(String[] args) {
		List<Person> people = createPeople();
		
		
		
		//print all males
//		List<String> males = people.stream()
//				.filter(person->person.getGender().equals(Gender.MALE))			
//				.map(Person::getName)			
//				.collect(Collectors.toList());		
//		
//		System.out.println(males);	
		
//		List<Person> males = people.stream()
//				.filter(person->person.getGender().equals(Gender.MALE))			
//				.map(person->new Person(person.getName(), person.getAge(), person.getGender()))			
//				.collect(Collectors.toList());		
//		
//		for (Person male : males) {
//			System.out.println(male.getName()+" : "+male.getGender());
//		}		
		
		
//		people.stream()
//				.filter(person->person.getGender().equals(Gender.MALE))			
//				.map(person->new Person(person.getName(), person.getAge(), person.getGender()))			
//				.forEach(new Consumer<Person>() {
//
//					@Override
//					public void accept(Person person) {
//						
//						System.out.println(person.getName() +" : "+person.getGender());
//					}
//				});	
		
//		people.stream()
//				.filter(person -> person.getGender().equals(Gender.MALE))
//				.map(person -> new Person(person.getName(), person.getAge(), person.getGender()))
//				.forEach(person -> System.out.println(person));
		
		people.stream()
		.filter(person -> person.getGender().equals(Gender.MALE))
		.map(person -> new Person(person.getName(), person.getAge(), person.getGender()))
		.forEach(System.out::println);
		
		
		
		
		
	}

}
