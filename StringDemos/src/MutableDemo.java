
public class MutableDemo {

	public static void main(String[] args) {
		StringBuilder sb= new StringBuilder("Hello");
		System.out.println("sb == > "+sb);
		System.out.println("Hash code of sb == > "+sb.hashCode());
		
		sb.append(" Friend");
		System.out.println("sb == > "+sb);
		System.out.println("Hash code of sb == > "+sb.hashCode());
		

	}

}
