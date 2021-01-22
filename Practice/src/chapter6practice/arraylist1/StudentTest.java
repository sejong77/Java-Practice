package chapter6practice.arraylist1;

/* Lee �л��� �� ������ �����ϰ�, Kim �л��� �� ������ �����Ѵ�.
   �� �л��� ����, ����, ����� ������ ���� ����ض�.
   
   Student Ŭ������ ArrayList ��������� �ϳ� ������ �� �л��� �����ϴ� ������ �����ϵ��� �Ѵ�.
   
   <��� ���>
   	�л� �̽±���� ���� ���� ������ 95�� �Դϴ�.
	�л� �̽±���� ���� ���� ������ 100�� �Դϴ�.
	�л� �̽±���� ������ 195�� �̰�, ����� 97�� �Դϴ�.
	================================
	�л� ��������� ���� ���� ������ 100�� �Դϴ�.
	�л� ��������� ���� ���� ������ 95�� �Դϴ�.
	�л� ��������� ���� ���� ������ 88�� �Դϴ�.
	�л� ��������� ������ 283�� �̰�, ����� 94�� �Դϴ�.
 */


public class StudentTest {

	public static void main(String[] args) {
		
		Student lee= new Student("Lee");
		lee.addSubject("����", 85);
		lee.addSubject("����", 100);
		lee.showStudentInfo();
		
		System.out.println("====================================");
		
		Student kim= new Student("Kim");
		kim.addSubject("����", 100);
		kim.addSubject("����", 90);
		kim.addSubject("����", 85);
		kim.showStudentInfo();
		
	}

}
