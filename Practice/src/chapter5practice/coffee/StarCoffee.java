package chapter5practice.coffee;

public class StarCoffee {
	
	int money;
	
	public String brewing(int money) {
		if(money == Menu.STARAMERICANO) {
			return " ���ٹ� �Ƹ޸�ī�븦 �����߽��ϴ�. ";
		}
		else if(money == Menu.STARLATTE) {
			return " ���ٹ� �󶼸� �����߽��ϴ�. "; 
		}
		return null;
	}
	
}
