package staticpart;

public class Student {

	private static int serialNum= 1000;
	private int studentID;
	
	public String studentName;
	public String address;
	
	public Student(String name) {
		this.studentName= name;
		
		studentID= 2312;
		address= "��⵵ ������";
		
		serialNum++;
		studentID= serialNum;
	}
	
	public void showStudentInfo() {
		System.out.println("�̸�: " + studentName + ", �ּ�: " + address);
	}

	public int getStudentID() {
		serialNum++;
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public static int getSerialNum() {
		return serialNum;
	}

	public static void setSerialNum(int serialNum) {
		Student.serialNum = serialNum;
	}
	
	
}
