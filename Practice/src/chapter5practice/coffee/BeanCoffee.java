package chapter5practice.coffee;

public class BeanCoffee {
	
	int money;
	
	public String brewing(int money) {
		if(money == Menu.BEANAMERICANO) {
			return " ��ٹ� �Ƹ޸�ī�븦 �����߽��ϴ�. ";
		}
		else if(money == Menu.BEANLATTE) {
			return " ��ٹ� �󶼸� �����߽��ϴ�. "; 
		}
		return null;
	}
	
}
