package demo04.handson;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

import demo04.common.Gender;
import demo04.common.Person;

public class Solution004 {

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
		
		//TODO : total age of every one
		// holdno = stream people >> map ages >> reducing
		
//		int totalAge = people.stream()
//		.map(Person::getAge)
//		.reduce(0, new BinaryOperator<Integer>() {
//
//			@Override
//			public Integer apply(Integer carry, Integer age) {
//				
//				return carry+age;
//			}
//		});
		
//		int totalAge = people.stream().map(Person::getAge).reduce(0, (carry,age)->carry+age);
//		int totalAge =  people.stream().map(Person::getAge).reduce(0, Integer::sum);
		int totalAge = people.stream().mapToInt(Person::getAge).sum();
		System.out.println("Total Age of persons : "+totalAge);
		
	}

}
