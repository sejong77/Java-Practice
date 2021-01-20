package cooperation;

public class Taxi {

	public int taxiNumber;
	public int price;
	public int passenger;
	
	public Taxi(int taxiNumber) {
		this.taxiNumber= taxiNumber;
	}
	
	public void take(int money) {
		passenger++;
		this.price += money;
	}
	
	public void showTaxiInfo() {
		System.out.println(taxiNumber + "�� �ý��� �°� ���� " + passenger + "���̰�, ������ " + price + "�� �Դϴ�.");
	}
}
