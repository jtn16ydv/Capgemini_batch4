class Dog{
	
	private String name;
	public Dog(String name) {
		this.name=name;
	}
	@Override
	public String toString() {
		return this.name;
	}
	
}
public class FirstStringDemo {

	public static void main(String[] args) {
		String str = new String("Hello");
		Dog dog= new Dog("Tommy");
		System.out.println(str);
		System.out.println(dog);		
		
	}

}
