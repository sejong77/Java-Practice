package classpart;

public class Student {

	public int studentID;
	public String studentName;
	public String address;
	
	public void showStudentInfo() {
		System.out.println("�й�: " + studentID + ", �̸�: " + studentName + ", �ּ�: " + address);
	}
	
	public String getName() {
		return studentName;
	}
}
