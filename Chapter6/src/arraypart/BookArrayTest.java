package arraypart;

public class BookArrayTest {

	public static void main(String[] args) {

		Book library[]= new Book[5];
		
		library[0]= new Book("���1", "�赿��");
		library[1]= new Book("���2", "�赿��");
		library[2]= new Book("���3", "�赿��");
		library[3]= new Book("���4", "�赿��");
		library[4]= new Book("���5", "�赿��");
		
		for(Book b: library) {
			b.showBookInfo();
		}
		
		
		
	}

}
