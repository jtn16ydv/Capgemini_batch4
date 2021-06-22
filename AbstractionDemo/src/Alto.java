
public class Alto extends Car {

	public Alto(int regNo) {
		super(regNo);
	
	}

	public Alto() {
		
	}

	@Override
	public void drive() {
		System.out.println("Alto : Drive with normal steering : reg No : "+getRegNo());

	}

	@Override
	public void stop() {
		System.out.println("Alto : Stop with normal break : reg No :"+getRegNo());

	}

}
