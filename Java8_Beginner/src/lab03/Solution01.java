package lab03;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Solution01 {

	public static void main(String[] args) {
		List<String> topics = Arrays.asList("J2SE","J2EE","Spring Framework", "Spring Boot","JPA","Test Driven Development");
		
//		for (String topic : topics) {
//			System.out.println(topic);
//		}
//		
//		Consumer<String> consumer = topic->{System.out.println(topic);};
//		topics.forEach(consumer);
		
		Consumer<String> consumer = System.out::println;
		topics.forEach(consumer);
	
	}
}
