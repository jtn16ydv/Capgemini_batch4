package markerdemo;

public class Tester extends Employee {

	public Tester(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void doSomething() {
		System.out.println(getName()+" is Testing");

	}

}
