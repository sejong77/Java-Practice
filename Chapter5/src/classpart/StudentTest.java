package classpart;

public class StudentTest {

	public static void main(String[] args) {

		Student lee= new Student();
		lee.studentID= 10010;
		lee.studentName= "������";
		lee.address= "��⵵ ������";
		
		lee.showStudentInfo();
		System.out.println(lee.getName());
	}

}
