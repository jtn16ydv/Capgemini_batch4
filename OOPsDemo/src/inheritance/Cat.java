package inheritance;

public class Cat extends Animal{
	
	public Cat() {
		// TODO Auto-generated constructor stub
	}

	public Cat(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public void bite() {
		System.out.println(getName()+" is biting");
	}
}
