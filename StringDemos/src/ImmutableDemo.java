
public class ImmutableDemo {

	public static void main(String[] args) {
		String str="Hello";
		System.out.println("Hash code of str = : "+str.hashCode());
		System.out.println("str = > "+str);
		
		str+=" Friends";
		System.out.println("Hash code of str = : "+str.hashCode());	
		System.out.println("str = > "+str);

	}

}
