package stream.inputstream;

import java.io.IOException;
import java.io.InputStreamReader;

public class SystemInTest2 {

	public static void main(String[] args) {

		System.out.println("���� �Է��ϼ���(�����Ϸ��� '��'�� �Է�) ");
		
		try(InputStreamReader isr= new InputStreamReader(System.in)) {
			int i;
			
			while( (i= isr.read()) != '��') {
				System.out.print((char) i + "");
			}
			
		} catch(IOException e) {
			System.out.println(e);
		}
		
		System.out.println("���α׷��� �����߽��ϴ�.");
	}

}
