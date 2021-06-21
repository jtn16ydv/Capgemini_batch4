package overloading;

public class MyMath {

	public void add(int num1, int num2) {

		System.out.println("------------add(int num1, int num2)------------");
		System.out.println("Result : " + (num1 + num2));
	}

	public void add(int num1, float num2) {

		System.out.println("------------add(int num1, float num2)------------");
		System.out.println("Result : " + (num1 + num2));
	}

	public void add(float num1, int num2) {

		System.out.println("------------add(float num1, int num2)------------");
		System.out.println("Result : " + (num1 + num2));
	}

	public void add(float num1, float num2) {

		System.out.println("------------add(float num1, float num2)------------");
		System.out.println("Result : " + (num1 + num2));
	}

}
