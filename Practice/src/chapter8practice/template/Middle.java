package chapter8practice.template;

public class Middle extends PlayerLevel{

	@Override
	public void run() {
		System.out.println("������ �޸��ϴ�.");
	}

	@Override
	public void jump() {
		System.out.println("���� jump�� �մϴ�.");
	}

	@Override
	public void turn() {
		System.out.println("turn �� �� �𸨴ϴ�.");
	}

	@Override
	public void showInfo() {
		System.out.println("******** �߱��� ���� ********");		
	}
}
