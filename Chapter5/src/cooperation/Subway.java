package cooperation;

public class Subway {

	public int subwayNumber;
	public int price;
	public int passenger;
	
	public Subway(int subwayNumber) {
		this.subwayNumber= subwayNumber;
	}
	
	public void take(int money) {
		passenger++;
		this.price += money;
	}
	
	public void showSubwayInfo() {
		System.out.println(subwayNumber + "ȣ�� ����ö�� �°� ���� " + passenger + "���̰�, ������ " + price + "�� �Դϴ�.");
	}
}
