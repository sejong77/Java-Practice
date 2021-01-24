package stream.inputstream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputTest1 {

	public static void main(String[] args) {

		FileInputStream fis= null;
		
		try {
			fis= new FileInputStream("input.txt");
			int i;
			while( (i= fis.read()) != -1) {
				System.out.print((char) i + " ");
			}
			
		} catch(IOException e) {
			System.out.println(e);
			
		} finally {
			try {
				fis.close();
			} catch(Exception e) {
				System.out.println(e);
			}
		}
		System.out.println("End!");
		
		
		
		
	}

}
