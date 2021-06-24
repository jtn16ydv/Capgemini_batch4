package withenum_demo4;

public enum Currency {

	PENNEY(1) {
		@Override
		public String color() {
			return "Copper";
		}
	}, 
	
	
	NICKEL(5) {
		@Override
		public String color() {
			return "Bronze";
		}
	}, 
	
	
	DIME(10) {
		@Override
		public String color() {
			return "Silver";
		}
	}, 
	
	
	QUARTER(25) {
		@Override
		public String color() {
			return "Silver";
		}
	};
	
	private int value;
	
	private Currency(int value) {
		this.value=value;
	}
	
	public int getValue() {
		return value;
	}
	
	public abstract String color();
}
