
public class CubeSum {

	public int calculate(int num) {
		int sum=0;
		while(num>=1) {
			int n =  num%10;
			int cube= n*n*n;
			sum=sum+cube;
			num=num/10;
		}
		return sum;
	}

}
