package ExceptionError;

/*
 * 
 */
public class ArrayIndexOutofboundException {

	//array index out of bound exception 
	public static void main(String[] args) {
		m2();
		int[] arr1 = {12,13,15,16};
		for(int i= 0 ; i <= arr1.length ;i++) {
			System.out.print(arr1[i]);
		}
	}
	//string index out of bond exception 
	
	public static void m2() {
		String name = "Pooja";
		
		System.out.print(name.charAt(6));
		}
	}

