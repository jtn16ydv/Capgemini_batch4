package encapsulation;

public class Dog {
	
	// adjectives, fields, state
	private String name;
	private int age;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		if(age<1) {
			throw new RuntimeException("Negative Age is not Allowed");
		}			
		this.age = age;		
	}
	
	
	
	@Override
	public String toString() {
		return "Dog [name=" + name + ", age=" + age + "]";
	}
	//verbs, methods, behaviour
	public void eat() {
		System.out.println(name +" is eating : age : "+age);
	}
	public void run() {
		System.out.println(name +" is running : age : "+age);
	}

}
