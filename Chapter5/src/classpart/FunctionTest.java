package classpart;

public class FunctionTest {
	
	// ��ȯ ���� �ְ�, �Ű������� �ִ� �޼���
	public static int addNum(int num1, int num2) {
		return num1 + num2;
	}
	
	// ��ȯ ���� ����, �Ű������� �ִ� �޼���
	public static void sayHello(String greeting) {
		System.out.println(greeting);
	}
	
	// ��ȯ ���� �ְ� �Ű������� ���� �޼���
	public static int calcSum() {
		int sum= 0;
		
		for(int i=0; i<=100; i++) {
			sum += i;
		}
		return sum;
	}
	
	public static void main(String[] args) {

		int n1= 10;
		int n2= 30;
		
		int total= addNum(n1, n2);
		System.out.println(total);
		
		sayHello("Hello My Name is Hong");
		
		int sum= calcSum();
		System.out.println(sum);
	}

}
