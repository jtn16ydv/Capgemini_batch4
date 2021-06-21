package encapsulation;

public class DogTest {

	public static void main(String[] args) {
		Dog dog =  new Dog();
		dog.setName("Tommy");
		dog.setAge(-5);
		dog.eat();
		dog.run();
		System.out.println(dog);

	}

}
