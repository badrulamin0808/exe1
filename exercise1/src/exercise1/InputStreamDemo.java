package exercise1;

	import java.io.FileInputStream;
	import java.io.IOException;

	public class InputStreamDemo {

		public static void main(String[] args) {
			
			// Declaration of source storage
			String sourceStorage = "data1.dat";
			
			// Declaration of input stream object
			FileInputStream fileInputStream;
			
			try {
				
				// Construct input stream
				fileInputStream = new FileInputStream(sourceStorage);
				
				// Read from input stream
				System.out.println(fileInputStream.read());
				System.out.println(fileInputStream.read());
				System.out.println(fileInputStream.read());
				System.out.println(fileInputStream.read());
				
				System.out.println("\n");
				
				// Close stream
				fileInputStream.close();  
				
			} catch (IOException e) {
				
				System.out.println("Durian Tunggal... we got problem");
				
				e.printStackTrace();
			}  
			
			System.out.println("End of program.  Check out " + sourceStorage + ". "
					+ "Compare the output from the console");

		}

	}
