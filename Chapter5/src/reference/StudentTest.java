package reference;

public class StudentTest {

	public static void main(String[] args) {

		Student lee= new Student(10020, "������");
		lee.setKoreaSubject("����", 85);
		lee.setMathSubject("����", 90);
		lee.showStudentInfo();
		
		System.out.println();
		
		Student kim= new Student(30231, "�����");
		kim.setKoreaSubject("����", 90);
		kim.setMathSubject("����",  87);
		kim.showStudentInfo();
	
	
	
	}
}