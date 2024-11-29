package ExceptionError;

public class classNotFoundException {

	
    public static void main(String[] args) throws ClassNotFoundException {
//        try {
            // Attempt to load a class dynamically using Class.forName()
            Class.forName("com.example.NonExistentClass");
        
//        } catch (ClassNotFoundException e) {
//            System.out.println("Class not found: " + e.getMessage());
//        }
    }
}
