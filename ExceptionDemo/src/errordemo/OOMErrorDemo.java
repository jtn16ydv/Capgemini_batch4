package errordemo;

public class OOMErrorDemo {

	public static void main(String[] args) {
	
		StringBuilder sb = new StringBuilder("Hello ");
		while(true) {
			sb.append("Friends ");
//			System.out.println("sb = "+sb);
//			System.out.println("sb hascode : "+sb.hashCode());
			
		}

	}

}
