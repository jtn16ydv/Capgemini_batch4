

public class SimpleArrayDemo {

	public static void main(String[] args) {
		int [][] numbers  =  new int[2][];
		numbers[0]=new int[3];
		numbers[1]=new int[5];
		
		System.out.println(numbers);
		System.out.println("hash code of numbers : "+numbers.hashCode());
		System.out.println("lenth of the numbers : "+numbers.length);
		
		System.out.println("numbers[0] : "+numbers[0]);
		System.out.println("numbers[1] : "+numbers[1]);
		
		System.out.println("hashcode of numbers[0] : "+numbers[0].hashCode());
		System.out.println("hashcode of numbers[1] : "+numbers[0].hashCode());
		System.out.println("length of numbers[0] : "+numbers[0].length);
		System.out.println("length of numbers[1] : "+numbers[1].length);
	

	}

}
