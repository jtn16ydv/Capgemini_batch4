package overriding;

public class Animal {
	private String name;
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}

	public void eat() {
		System.out.println(getName()+" is eating....");
	}
}
