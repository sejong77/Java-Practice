package cooperation;

public class Bus {

	public int busNumber;
	public int price;
	public int passenger;
	
	public Bus(int busNumber) {
		this.busNumber= busNumber;
	}
	
	public void take(int money) {
		passenger++;
		this.price += money;
	}
	
	public void showBusInfo() {
		System.out.println(busNumber + "�� ������ �°� ���� " + passenger + "���̰�, ������ " + price + "�� �Դϴ�.");
	}
}
