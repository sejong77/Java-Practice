package bookshelf;

public class BookShelfTest {

	public static void main(String[] args) {

		Queue books= new BookShelf();
		
		books.enQueue("�¹���1");
		books.enQueue("�¹���2");
		books.enQueue("�¹���3");
		
		System.out.println(books.getSize());
		
		System.out.println(books.dequeue());
		System.out.println(books.dequeue());
		System.out.println(books.dequeue());
		
		
	}

}
