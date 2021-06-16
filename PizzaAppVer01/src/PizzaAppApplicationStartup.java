
public class PizzaAppApplicationStartup {

	private static String pizzaName;
	private static String size;
	private static String crust;
	private static double price;
	private static String toppings;

	public static void main(String[] args) {

		// orderPizza
		String tokenNo = orderPizza(PizzaConstants.DELUX_VAGIL_PIZZA_NAME, PizzaConstants.MEDIUM_SIZE,
				PizzaConstants.THIN_CRUST);
		// cookPizza
		cookPizza(tokenNo);

		// displayOrder
		displayOrder();

	}

	private static void cookPizza(String tokenNo)  {
		System.out.println("Wait for 30 mins. your order is getting in process.");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(tokenNo.equals(PizzaAppApplicationStartup.pizzaName+"101")) {
			PizzaAppApplicationStartup.price = PizzaConstants.MEDIM_DELUX_VAGIL_PRICE;
			PizzaAppApplicationStartup.toppings = PizzaConstants.DELUX_VAGIL_TOPPINGS;
		}

	}

	private static void displayOrder() {
		System.out.println("Pizza Name : " + pizzaName);
		System.out.println("Size : " + size);
		System.out.println("Crust : " + crust);
		System.out.println("Price : " + price);
		System.out.println("Toppings : " + toppings);

	}

	private static String orderPizza(String pizzaName, String size, String crust) {
		PizzaAppApplicationStartup.pizzaName = pizzaName;
		PizzaAppApplicationStartup.size = size;
		PizzaAppApplicationStartup.crust = crust;
		// logic for token creation
		return pizzaName + "101";

	}

}
