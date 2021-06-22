
public  abstract class Car {
	
	private int regNo;
	
	public Car() {
		//this.regNo = 1111; // value initialization
		this(1111); // redirection with default value, constructor chaining
		drive();
		fillTank();
		drive();
		stop();
	}
	public Car(int regNo) {
		this.regNo=regNo; // value initialization
	}	

	//default, or common feature
	public void fillTank() {
		System.out.println("Car is fuling --- With CNG");
	}
	public int getRegNo() {
		return regNo;
	}
	
	public abstract void drive();
	public abstract void stop();

}
