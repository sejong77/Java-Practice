package chapter5practice.coffee;
/* ��ü �� ���� - ��ٱ� Ŀ�� ���
 - �� ���� ���� 4,000���� ���� ���ٹ濡�� �Ƹ޸�ī�븦 �缭 ���̴�. (���ٹ� �� ����: 4300��)
 - �� �ǰ� ���� 4,500���� ���� ��ٹ濡�� �󶼸� �缭 ���̴�. (��ٹ� �Ƹ޸�ī�� ����: 4200��)
 ��ü ���� ������ ����Ͽ�, ��ü ���� ������� �����ض�
 */


public class CoffeeTest {
	
	public static void main(String[] args) {
		
		Person kim= new Person("Kim", 10000);
		Person lee= new Person("Lee", 8000);
		
		BeanCoffee beanCoffee= new BeanCoffee();
		StarCoffee starCoffee= new StarCoffee();
		
		kim.buyStarCoffee(starCoffee, Menu.STARAMERICANO);
		lee.buyBeanCoffee(beanCoffee, Menu.BEANLATTE);
		
	}
	
}
