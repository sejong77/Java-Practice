package stream.inputstream;

import java.io.IOException;

public class SystemInTest {

	public static void main(String[] args) {
		
		System.out.print("���� �Է��ض�: ");
		
		try {
			int i;
			i= System.in.read();
			System.out.println(i);
			System.out.println((char) i);
			
		} catch(IOException e) {
			System.out.println(e);
		}
		
		
	}

}
