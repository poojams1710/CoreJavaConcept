package ExceptionError;

class AB {
	
	int m1(){
		try {	
			return 1;
		}catch(Exception e){
			return 2;	
		}finally {		
			return 3;
		}
		//return 0;
		
	}
	
}







public class trycatchfinallyReturnvalue {

	public static void main(String[] args) {
		
		AB a = new AB();
		
		int result = a.m1();
		
		System.out.print(result);
	}

}
