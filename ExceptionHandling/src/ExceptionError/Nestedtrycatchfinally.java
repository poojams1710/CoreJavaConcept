package ExceptionError;


public class Nestedtrycatchfinally {

	public static void main(String[] args) {
		try {
			System.out.println("outside nested try block and inside outer try block");
			try {
				System.out.println("Inside nested try block and inside outer try block");
				int i=2 ;
				int j=0;
				int k =i/j;
				System.out.println(k);
				
			}catch(Exception e) {
			
				System.out.println(e);
			}
			finally {
				System.out.println("nested finally block");
			}
		}catch(Exception e) {
			System.out.println(e);
			
		}finally {
			
			System.out.println("outside finally block");
		}
		System.out.println("outside outer try block");
		}
	

}
