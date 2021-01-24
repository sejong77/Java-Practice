package stream.reader;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileReaderTest {

	public static void main(String[] args) throws IOException {

		/* 1. FileInputStream�� ���� ��Ʈ���� InputStreamReader�� ����� ����Ʈ ������ �д� �ڷḦ ���� ������
		      ��ȯ���ִ� ��� 
		 
		FileInputStream fis= new FileInputStream("reader.txt");
		InputStreamReader isr= new InputStreamReader(fis);
		
		try {
			int i;
			while( (i= isr.read()) != -1) {
				System.out.print((char) i);
			}
		}catch(IOException e) {
			System.out.println(e);
		} */
		
		
		// 2. ���� ���� ��Ʈ���� FileReader�� ����� ���� ������ �ڷḦ �д� ���
		FileReader fr= new FileReader("reader.txt");
		
		try {
			int i;
			while( (i= fr.read()) != -1) {
				System.out.print((char) i);
			}
		}catch(IOException e) {
			System.out.println(e);
		}
		
		
	}

}
