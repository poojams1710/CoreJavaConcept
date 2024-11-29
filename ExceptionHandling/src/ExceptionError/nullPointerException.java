package ExceptionError;

import java.util.Date;

//nullpointerException is applicable on only instance variable and instance method its not applicable for static method and static variable

public class nullPointerException {

	public static void main(String[] args) {
		
		//NullpointerException 
		
				Date D = null ;
				System.out.print(D.toString());

	}

	
	static class A {
		 static  int i =2 ;
		 static void m1() {
			System.out.print("m1-Methods");
		}
	}
	
	static class B{
		public static void main(String[] args) {
			A a = null ;
			System.out.println(a.i);
			a.m1();
			
		}
	}
}
