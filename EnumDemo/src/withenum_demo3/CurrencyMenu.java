package withenum_demo3;

public enum CurrencyMenu {
	
	PENNY (1), DIME(2), NICKEl(3), QUARTER(4), DOLLAR(5);
	private int choiceOption;
	private CurrencyMenu(int choiceOption) {
		this.choiceOption = choiceOption;
	}
	
	public int getChoiceOption() {
		return choiceOption;
	}

}
