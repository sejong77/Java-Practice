package chapter8practice.template;

public class Super extends PlayerLevel{

	@Override
	public void run() {
		System.out.println("�ſ� ������ �޸��ϴ�.");
	}

	@Override
	public void jump() {
		System.out.println("��û ���� jump �մϴ�.");
	}

	@Override
	public void turn() {
		System.out.println("�� ���� ȸ���մϴ�.");
	}

	@Override
	public void showInfo() {
		System.out.println("******** ����� ���� ********");		
	}
}
