package exercise1;

/**
 * This program demonstrate the application of output stream that processed data as raw bytes.
 * The data is stored in a file.
 * 
 * @author emalianakasmuri
 * 
 */

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.IOException;

public class OutputStreamDemo {

	public static void main(String[] args) {
		
		int[] num = {64, 65};
		
		for(int i=0; i < num.length; i++) {
			
			String targetStorage = "file_"+i+".dat";
			FileOutputStream fileOutputStream;
			
			try {
				
				fileOutputStream = new FileOutputStream(targetStorage);
				
				String text = String.valueOf(num[i]);
				byte textInBytes[] = text.getBytes();
				fileOutputStream.write(textInBytes);
				fileOutputStream.flush();
							
				fileOutputStream.close();  
		         
			} catch (IOException e) {
				e.printStackTrace();
			}  
		}
		
		System.out.println("Generate binary data");
	}

}

