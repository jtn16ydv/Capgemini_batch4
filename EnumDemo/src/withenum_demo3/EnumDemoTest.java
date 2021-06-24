package withenum_demo3;

import java.util.Scanner;

public class EnumDemoTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int option;
		showMenu();
		System.out.println("Enter Choice : ");
		option = sc.nextInt();
		if(option==1) {
			getCoinWithValue(Currency.PENNEY);
		}
		
		

	}

	private static void showMenu() {
		for (CurrencyMenu menuItem : CurrencyMenu.values()) {
			System.out.println(menuItem.getChoiceOption()+":"+menuItem.name());
		}
		
	}

	private static void getCoinWithValue(Currency currency) {
		switch(currency) {
		case PENNEY:
			System.out.println("'"+currency+"' Coin : Value : "+currency.getValue());
			break;
		case NICKEL:
			System.out.println("'"+currency+"' Coin : Value : "+currency.getValue());
			break;
		case QUARTER:
			System.out.println("'"+currency+"' Coin : Value : "+currency.getValue());
			break;
		case DIME:
			System.out.println("'"+currency+"' Coin : Value : "+currency.getValue());
			break;
		}
		
		
	}

}
