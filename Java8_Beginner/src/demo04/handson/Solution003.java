package demo04.handson;

import java.util.Arrays;
import java.util.List;

import demo04.common.Gender;
import demo04.common.Person;

public class Solution003 {

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
		
		System.out.println("------Before Change :  Without Java8--------");
		for (Person person : people) {
			System.out.println(person);
		}
		
		//print all males, but name in upper case
		
		System.out.println("------After Change :  With Java8--------");
		
		// Tanki --------------------------- Pani from tap
		// people list --------------------- people list only male, name in upper case
		// stream people >> filter male >> name in upper case >> display person
		
		people.stream()
		.filter(person->person.getGender().equals(Gender.MALE)) // Predicate - test
		.map(person->new Person(person.getName().toUpperCase(), person.getAge(), person.getGender())) // Function - apply
		.forEach(System.out::println); // Consumer - accept	
		
	}

}
