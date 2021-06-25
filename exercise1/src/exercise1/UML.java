package exercise1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class UML {
	
public static void main (String[] args)
{
	FileOutputStream output = null;
	FileInputStream input = null;
	
	try {
		File out =new File("ProductUML2.png");
		File in = new File("ProductUML.png");
		
		output = new FileOutputStream(out);
		input = new FileInputStream(in);
		
		byte[] buffer = new byte[1024];
		 
	    int length;

	    while ((length = input.read(buffer)) > 0){
	    	output.write(buffer, 0, length);
	    }

	    input.close();
	    output.close();

	    System.out.println("Done!");
	}catch(IOException ioe){
		ioe.printStackTrace();

			}
	}
}