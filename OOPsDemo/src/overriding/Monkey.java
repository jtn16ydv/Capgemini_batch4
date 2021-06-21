package overriding;

public class Monkey extends Animal{
	
	@Override
	public void eat() {
		System.out.println(getName()+" Intake food from hand like human ");
	}

}
