package demo04.handson;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;

import demo04.common.Gender;
import demo04.common.Person;

public class Solution006 {

	// Suppose this data might be comming from backend app or some REST call
	public static List<Person> createPeople() {
		return Arrays.asList(
				new Person("pankaj", 38, Gender.MALE), 
				new Person("Manvi", 6, Gender.FEMALE),
				new Person("Aman", 34, Gender.MALE), 
				new Person("Bindu", 23, Gender.FEMALE),
				new Person("Kabir", 17, Gender.MALE), 
				new Person("Monika", 45, Gender.FEMALE),
				new Person("Monika", 35, Gender.FEMALE), 
				new Person("Vijay", 15, Gender.MALE),
				new Person("Priyanka", 35, Gender.FEMALE));
	}

	public static void main(String[] args) {
		List<Person> people = createPeople();

		// TODO: total number of adults
		// holdCount = stream people >> filter people more than 18 years >> count the person
		
		int totalAdults = (int)people.stream()
		.filter(person->person.getAge()>=18)
		.count();
		
		System.out.println("Total Adults : "+totalAdults);
		
		
	}

}
