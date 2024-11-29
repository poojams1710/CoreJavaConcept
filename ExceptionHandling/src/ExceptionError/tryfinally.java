package ExceptionError;

public class tryfinally {

	public static void main(String[] args) {
		
		try {
			System.out.println("inside try block");
			int i =1 ;
			int j= 0;
			
		       int k =i/j;
		       
		       System.out.println("after exception in try block");
		       
		}finally {
			 System.out.println("finally block with try block");
			
		}
		
		System.out.println("after finally it will execute");

	}

}
