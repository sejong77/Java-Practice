package template;

public class PersonCar extends Car{

	@Override
	public void turnOn() {
		System.out.println("����� �õ��� �մϴ�.");
	}

	@Override
	public void start() {
		System.out.println("����� ���� ������ �մϴ�.");
	}

	@Override
	public void stop() {
		System.out.println("����� �극��ũ�� ��� ����ϴ�.");
	}

	@Override
	public void turnOff() {
		System.out.println("����� �õ��� ���ϴ�.");
	}
	
	public void wash() {
		System.out.println("����� ���� ������ �մϴ�.");
	}

	
}
