package ExceptionError;
import java.io.IOException;

/*
 * In Java we handled exception in by two ways
 * 1. throws
 * 2.try catch
 * throws keyword we use for checked Exception:
 */
public class keywordThrows {

	    public static void main(String[] args) {
	        try {
	            readFile(null);
	        } catch (IOException e) {
	            System.out.println("File reading failed: " + e.getMessage());
	        }
	    }

	    static void readFile(String fileName) throws IOException {
	        if (fileName == null) {
	            throw new IOException("File name cannot be null");
	        }
	        // Simulate file reading
	        System.out.println("Reading file: " + fileName);
	    }
}
