package demo04.handson;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import demo04.common.Gender;
import demo04.common.Person;

public class Solution001 {

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
		
		//TODO : Get the name of all females in upper case who are in age more than 6
		System.out.println("------Using Imperative Way------");
		List<String> filteredNames = new ArrayList<>();
		for (Person person : people) {
			if(person.getAge()>6 && person.getGender().equals(Gender.FEMALE)) {
				filteredNames.add(person.getName().toUpperCase());
			}
		}
		System.out.println(filteredNames);
		
		
		
		/**
		 * The above code mixes what with how
		 * - Create filteredNames collection separately, iterate people, check condition and add each element in the filteredNames and finaly display.
		 * - This is called imperative way of working - mutable and low level details.
		 * - Here in this case you are focusing in each detail
		 */
		
		System.out.println("------Using Declarative Way : Approach 1------");
		List<String> filteredGirls_app01 = people.stream()
									 .filter(new Predicate<Person>() {

										@Override
										public boolean test(Person person) {
											
											return (person.getAge()>6 && person.getGender().equals(Gender.FEMALE));
										}
									})
									 .map(new Function<Person, String>() {

										@Override
										public String apply(Person person) {
											
											return person.getName();
										}
									})
									 .map(new Function<String, String>() {

										@Override
										public String apply(String name) {
											
											return name.toUpperCase();
										}
									})
									 .collect(Collectors.toList());
		
		System.out.println(filteredGirls_app01);
		
		System.out.println("------Using Declarative Way : Approach 2------");
		List<String> filteredGirls_app02 = people.stream()
				.filter(
				 person->person.getAge()>6 && person.getGender().equals(Gender.FEMALE))			
				.map(person-> person.getName())
				.map(name->name.toUpperCase())			
				.collect(Collectors.toList());
		
		
		System.out.println(filteredGirls_app02);
		
		System.out.println("------Using Declarative Way : Approach 3------");
		//--> stream list>>test condition >> getName >> convert in upper case >> collection list
		List<String> filteredGirls_app03 = people.stream()
				.filter(
				 person->person.getAge()>6 && person.getGender().equals(Gender.FEMALE))			
				.map(Person::getName)
				.map(String::toUpperCase)			
				.collect(Collectors.toList());		
		
		System.out.println(filteredGirls_app03);
									 
		
		
		
		
	}

}
