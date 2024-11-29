package ExceptionError;

/*
 * To raise Exception Explicitly throw keyword we use .Using throw keyword we can give checked unchecked both type of exception.any nymber of thow you can go for 
 * if we provide any statement after throw keyword compiler will give unreachable statement error
 * 
 * 
 */
public class keywordThrow {

	public static void main(String[] args) {
		m2(30);
		
		

	}
	
	public static void m2(int marks) {
		
		if(marks >= 30) {
			System.out.print("you are in level 2");	
			}if(marks <= 18 ) {
				throw new RuntimeException("not eligible try next time");
				//unreachable code 
				//System.out.checkError();
			}
//			else {
//				throw new RuntimeException("not eligible ");
//			}
		}
		
	}