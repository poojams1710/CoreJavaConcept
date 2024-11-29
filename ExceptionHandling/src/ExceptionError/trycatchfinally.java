package ExceptionError;

/*
 * throws keyword bypass exception to its caller method its not handle the exception 
 * In java application if you want to handle the exception at location where it is generated there we will use try cathc finally
 * try block
 * 
 */
public class trycatchfinally {
	static int  k;
	
	public static void main(String[] args) {
		System.out.println("before try block ");
		
		try {
			System.out.println("before exception occur try block");
			
			int i = 3;
			int j = 0;
		       k = i/j ;
			
			System.out.println(k);
			
			
		}catch(Exception e){
			System.out.println("exception caught here and its comes through catch for normal termination   " + k);
			
		}finally {
			
			System.out.println("finally execute at end ");
			
		}
		System.out.println("In end after finally ");
		
	}
	

}
