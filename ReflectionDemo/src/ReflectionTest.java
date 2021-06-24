import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ReflectionTest {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
//		Class c = Class.forName("Employee");
//		System.out.println(c);
//		
//		System.out.println("Super class of employee : "+c.getSuperclass());
//		
//		int mod = c.getModifiers();
//		System.out.println("mod : "+mod);
//		
//		System.out.println("modifier : "+Modifier.toString(mod));
//		
//		Class [] classes = c.getInterfaces();
//		System.out.println(classes[0].hashCode());
//		System.out.println(classes[1].hashCode());
//		System.out.println(classes[2].hashCode());
//		
//		Field[] fields = c.getDeclaredFields();
//		for (Field field : fields) {
//			System.out.println(field);
//		}
//		
//		Method[] methods = c.getDeclaredMethods();
//		for (Method method : methods) {
//			System.out.println(method);
//		}
		
	//	Employee employee=new Employee();
		Class c = Class.forName("Employee");
		Constructor[] constructors =c.getDeclaredConstructors();
		constructors[0].setAccessible(true);
		Object obj = constructors[0].newInstance();
		System.out.println(obj);

	}

}
