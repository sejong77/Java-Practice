package interfaceex;

public interface Calc {

	// �������̽����� ������ ������ ������ �������� ����� ��ȯ��
	double PI= 3.14;
	int ERROR= -9999999;
	
	// �������̽����� ������ �޼���� ������ �������� �߻� �޼���� ��ȯ��
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
	default void description() {
		System.out.println("���� ���⸦ �����մϴ�.");
		myMethod();
	}
	
	static int total(int arr[]) {
		int total= 0;
		
		for(int i=0; i<arr.length; i++) {
			total += arr[i];
		}
		myStaticMethod();
		return total;
	}
	
	private void myMethod() {
		System.out.println("Private Method");
	}
	
	private static void myStaticMethod() {
		System.out.println("Private Static Method");
	}
}
