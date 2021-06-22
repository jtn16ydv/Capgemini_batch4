package markerdemo;

public class Programmer extends Employee implements Expert {

	public Programmer(String name) {
		super(name);
		
	}

	@Override
	public void doSomething() {
		System.out.println(getName()+" is  Programming ");

	}

}
