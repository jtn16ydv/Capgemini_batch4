package markerdemo;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee [] employees = new Employee[] {
				
				new Programmer("Harsh"),
				new Tester("Arzoo"),
				new Tester("Ishu"),
				new Programmer("Lav"),
				new Programmer("Siddhant")
		};
		
		for (Employee employee : employees) {
			if(employee instanceof Expert) {
				employee.doSomething();
			}
			
		}

	}

}
