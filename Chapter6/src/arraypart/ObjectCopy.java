package arraypart;

public class ObjectCopy {

	public static void main(String[] args) {

		// ��ü �迭�� ���� ����
		Book library[]= new Book[5];
		Book copyLibrary[]= new Book[5];
		
		library[0]= new Book("�˵�1", "������");
		library[1]= new Book("�˵�2", "������");
		library[2]= new Book("�˵�3", "������");
		library[3]= new Book("�˵�4", "������");
		library[4]= new Book("�˵�5", "������");
		
		System.arraycopy(library, 0, copyLibrary, 0, 5);
		
		/*for(Book b: library) {
			b.showBookInfo();
		} */
		
		library[0].setTitle("�±ǵ�1");
		library[0].setAuthor("��");
		
		for(Book l: library) {
			l.showBookInfo();
		}
		
		System.out.println("===========================");
		
		for(Book c: copyLibrary) {
			c.showBookInfo();
		}
	}

}
