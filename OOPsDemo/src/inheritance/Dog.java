package inheritance;

public class Dog extends Animal{
	

	public Dog() {
		// TODO Auto-generated constructor stub
	}
	
	public Dog(String name) {
		super(name);
	}

	public void bark() {
		System.out.println(getName()+" is barking");
	}

}
