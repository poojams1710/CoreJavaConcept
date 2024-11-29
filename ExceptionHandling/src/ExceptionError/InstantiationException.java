package ExceptionError;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;


//constructor Exception 

public class InstantiationException {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, ClassNotFoundException, java.lang.InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class<?> clazz = Class.forName("D");
        Constructor<?> constructor = clazz.getConstructor(int.class);
        Object obj = constructor.newInstance("jaguar");

	}

}
class D{
	
	private class E{
		 private E(String model) {  // Only a parameterized constructor
		        System.out.println("Car created: " + model);
		    }
		
	}
	
}
