package constructor;

public class StudentTest {

	public static void main(String[] args) {

		Student kim= new Student("��ö��");
		kim.address= "����� ������";
		kim.setStudentID(20323);
		
		Student shin= new Student(10030, "��⵵ �ǿս�");
		shin.studentName= "�ż���";
		
		kim.showStudentInfo();
		shin.showStudentInfo();
	}

}
