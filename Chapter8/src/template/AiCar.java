package template;

public class AiCar extends Car{

	@Override
	public void turnOn() {
		System.out.println("�ڵ����� �õ��� �մϴ�.");
	}

	@Override
	public void start() {
		System.out.println("���������� �մϴ�.");
	}

	@Override
	public void stop() {
		System.out.println("�ڵ����� ����ϴ�.");
	}

	@Override
	public void turnOff() {
		System.out.println("�ڵ����� �õ��� ���ϴ�.");
	}

}
