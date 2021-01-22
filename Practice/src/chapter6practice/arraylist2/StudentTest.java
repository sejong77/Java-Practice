package chapter6practice.arraylist2;

/* Student Ŭ������ ����� �� �л����� ���� å�� Student Ŭ���� ���� ArrayList�� �����Ͽ� �����ϵ��� �ض�.
   ������ ���� ��µǵ��� Student, Book, StudentTest Ŭ������ ����� �����϶�
   
   <��� ���>
   Lee �л��� ���� å��: �¹���1, �¹���2 �Դϴ�.
   Kim �л��� ���� å��: ����1, ����2, ����3 �Դϴ�.
   Cho �л��� ���� å��: �ظ�����1, �ظ�����2, �ظ�����3, �ظ�����4, �ظ�����5, �ظ�����6 �Դϴ�.
 */

public class StudentTest {

	public static void main(String[] args) {
		
		Student lee= new Student("Lee");
		lee.addBook("�¹���1");
		lee.addBook("�¹���2");
		lee.showStudentInfo();
		
		Student kim= new Student("Kim");
		kim.addBook("����1");
		kim.addBook("����2");
		kim.addBook("����3");
		kim.showStudentInfo();
		
		Student cho= new Student("Cho");
		cho.addBook("�ظ�����1");
		cho.addBook("�ظ�����2");
		cho.addBook("�ظ�����3");
		cho.addBook("�ظ�����4");
		cho.addBook("�ظ�����5");
		cho.addBook("�ظ�����6");
		cho.showStudentInfo();
		
		
	}

}
