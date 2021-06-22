
public class BalenoZeta extends Car{

	public BalenoZeta(int regNo) {
		super(regNo);
	}
	
	public BalenoZeta() {
		super();
	}

	@Override
	public void drive() {
		System.out.println("BalenoZeta : Drive with power steering : reg No : "+getRegNo());

	}

	@Override
	public void stop() {
		System.out.println("BalenoZeta : Stop with power break : reg No : "+getRegNo());

	}
}
