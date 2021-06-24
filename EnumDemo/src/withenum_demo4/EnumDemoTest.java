package withenum_demo4;



public class EnumDemoTest {

	public static void main(String[] args) {

		getCoinWithValue(Currency.QUARTER);

	}

	private static void getCoinWithValue(Currency currency) {
		switch (currency) {
		case PENNEY:
			System.out.println("'" + currency + "' Coin : Value : " + currency.getValue() + "Color : "+currency.color());
			break;
		case NICKEL:
			System.out.println("'" + currency + "' Coin : Value : " + currency.getValue() + "Color : "+currency.color());
			break;
		case QUARTER:
			System.out.println("'" + currency + "' Coin : Value : " + currency.getValue() + "Color : "+currency.color());
			break;
		case DIME:
			System.out.println("'" + currency + "' Coin : Value : " + currency.getValue() + "Color : "+currency.color());
			break;
		}

	}

}
