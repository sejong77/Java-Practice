package inheritance;

public class CustomerTest {

	public static void main(String[] args) {

		Customer lee= new Customer(10010, "�̼���");
		lee.bonusPoint= 1000;
		System.out.println(lee.showCustomerInfo());
		
		Customer kim= new VIPCustomer(10020, "������");
		kim.bonusPoint= 10000;
		System.out.println(kim.showCustomerInfo());
		
	}

}
