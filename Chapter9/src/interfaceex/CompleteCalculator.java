package interfaceex;

public class CompleteCalculator extends Calculator{
	
	public int times(int num1, int num2) {
		return num1 * num2;
	}
	
	public int divide(int num1, int num2) {
		if(num2 == 0) {
			return ERROR;
		}
		else {
			return num1 / num2;
		}
	}
	
	public void showInfo() {
		System.out.println("��� ���� �Ϸ�.");
	}
	
	public void description() {
		System.out.println("������ �� description");
	}
}
