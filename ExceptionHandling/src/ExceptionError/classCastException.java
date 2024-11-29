package ExceptionError;

public class classCastException {

	public static void main(String[] args) {
		
		
	}

}

class A{
	
}

class B extends A{
	
//	 B b = new B();
	
     A a = new A();
     B b1 = (B)a;
	
}