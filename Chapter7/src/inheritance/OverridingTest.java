package inheritance;

public class OverridingTest {

	public static void main(String[] args) {

		Customer lee= new Customer(10010, "�̼���");
		lee.bonusPoint= 1000;
		
		Customer kim= new VIPCustomer(10020, "������");
		kim.bonusPoint= 10000;
		
		int priceLee= lee.calcPrice(10000);
		int priceKim= kim.calcPrice(10000);
		
		System.out.println(lee.showCustomerInfo() + "���� �ݾ��� " + priceLee + "�� �Դϴ�.");
		System.out.println(kim.showCustomerInfo() + "���� �ݾ��� " + priceKim + "�� �Դϴ�.");
	}

}
