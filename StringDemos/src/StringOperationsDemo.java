
public class StringOperationsDemo {

	public static void main(String[] args) {
		String str = new String("Hello Friends");
		
		System.out.println("str = "+str);
		System.out.println("charAt()= "+str.charAt(6));
		System.out.println("endsWith= "+str.endsWith("ends"));
		System.out.println("indexOf= "+str.indexOf('F'));
		System.out.println("lastIndexOf= "+str.lastIndexOf('e'));
		System.out.println("length= "+str.length());
		System.out.println("replace= "+str.replace('e','X'));
		String copyright = "CopyRight | 2021";
		System.out.println("CopyRight : "+copyright);
		System.out.println("CopyRight : "+copyright.replace("2021", "2022"));
		System.out.println("subString : "+str.substring(6));
		System.out.println("subString : "+str.substring(6,str.lastIndexOf('e')));
		System.out.println("Lower case : "+str.toLowerCase());
		System.out.println("Upper case : "+str.toUpperCase());
		
		String str2 =  new String("Hello Dear Friends");
		System.out.println("str2 = "+str2);
		//Output :  Friends Dear Hello
		String[] tokens = str2.split(" ");
		for(int i=tokens.length-1;i>=0;i--) {
			System.out.print(tokens[i]+" ");
		}
		

	}

}
