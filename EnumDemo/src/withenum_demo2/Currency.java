package withenum_demo2;

public enum Currency {

	PENNEY(1), NICKEL(5), DIME(1), QUARTER(25);
	
	private int value;
	
	private Currency(int value) {
		this.value=value;
	}
	
	public int getValue() {
		return value;
	}
}
