package ExceptionError;

import java.util.Date;

/*
 * Exception Handling : difference in Exception and Error 
 * Error is problem It will not allow execution of program
 * Compilation Error : at time of compilation the error which we gets is compilation error 
 * Lexical error : itn i =10 ; (spelling mistake)
 * Syntax error : i int  =10 ;  (wrong data types ) 
 * Semantic error : int i =10 ;(incompatible  data type ) 
 * int j ="12";
 * int k =i+j ;
 * Runtime error : The error which we get at runtime and unable to provide solution is Runtime error.
 * Example Insufficient main memory
 * 
 * Exceptions : the problem which occurs at runtime but for which we can provide solutions programmatically .
 * Predefined class to handle predefined Exceptions 
 * 1. Checked Exception : It get notify by complier that while runtime this exception is going to occur its come under checked Exception 
 * 2. Unchecked Exception :Exception is not get caught by complier it occurs at runtime all runtime exceptions and its subclasses come under Unchecked exception
 */
public class firstExceptionProgram {

	public static void main(String[] args) {
		// Arithmetic Exception 
		
		int i = 2;
		int j = 0;
		int k= i/j ;
		System.out.print(k);
		
		
		

	}

}

