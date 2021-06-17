
public class PlugabilityDemo {

	public static void main(String[] args) {
		int[][] numbers = new int[2][2];
		numbers[0][0] = 10;
		numbers[0][1] = 20;
		
		numbers[1][0] = 30;
		numbers[1][1] = 40;
		
		System.out.println("----------- Before changes -----------");
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j <numbers[i].length; j++) {
				System.out.print(numbers[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("Hash code of numbers[0] : "+numbers[0].hashCode());
		System.out.println("Hash code of numbers[1] : "+numbers[1].hashCode());
		
		int []temp = new int[] {100,200,300,400,500};
		System.out.println("Hash code of temp : "+temp.hashCode());
		numbers[1]=temp;
		
		System.out.println("----------- After changes -----------");
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j <numbers[i].length; j++) {
				System.out.print(numbers[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("Hash code of numbers[0] : "+numbers[0].hashCode());
		System.out.println("Hash code of numbers[1] : "+numbers[1].hashCode());
		

	}

}
