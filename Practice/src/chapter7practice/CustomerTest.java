package chapter7practice;

import java.util.ArrayList;

/* �Ϲ� ���� VIP ���� �߰� ��� �����
 ���� �þ� VIP ����ŭ ������ ���� �������� ������, �ܰ��� �е��� GOLD ������� �����ϰ� �ʹ�.
<GOLD����� ����>
- ��ǰ�� �� �� �׻� 10% ����
- ���ʽ� ����Ʈ�� 2% ����
- ��� ���� ������ ����

  �迭�� Ȱ���Ͽ� ������ ��
  ���� ���� 5���̴�. VIP 1��, GOLD 2��, SILVER 2�� �� ��, �� ���� 10000�� ¥�� ��ǰ�� ������ ���
  ������ �ݾװ� ������ ���ʽ� ����Ʈ�� ����ض�. ArrayList�� Ȱ���Ͽ� ����
 
 <��� ���>
 ======== ���� ���� ��� ========
�̼��� ���� ����� SILVER�̸�, ���ʽ� ����Ʈ�� 0�� �Դϴ�.
�Ż��Ӵ� ���� ����� SILVER�̸�, ���ʽ� ����Ʈ�� 0�� �Դϴ�.
ȫ�浿 ���� ����� GOLD�̸�, ���ʽ� ����Ʈ�� 0�� �Դϴ�.
������ ���� ����� GOLD�̸�, ���ʽ� ����Ʈ�� 0�� �Դϴ�.
������ ���� ����� VIP�̸�, ���ʽ� ����Ʈ�� 0�� �Դϴ�. ��� ���� ��ȣ�� 12345�Դϴ�.
======== �������� ���ʽ� ����Ʈ ��� ========
�̼��� ���� 10000�� �����ϼ̽��ϴ�.
�̼��� ���� ���� ���ʽ� ����Ʈ�� 100�� �Դϴ�.
�Ż��Ӵ� ���� 10000�� �����ϼ̽��ϴ�.
�Ż��Ӵ� ���� ���� ���ʽ� ����Ʈ�� 100�� �Դϴ�.
ȫ�浿 ���� 9000�� �����ϼ̽��ϴ�.
ȫ�浿 ���� ���� ���ʽ� ����Ʈ�� 200�� �Դϴ�.
������ ���� 9000�� �����ϼ̽��ϴ�.
������ ���� ���� ���ʽ� ����Ʈ�� 200�� �Դϴ�.
������ ���� 9000�� �����ϼ̽��ϴ�.
������ ���� ���� ���ʽ� ����Ʈ�� 500�� �Դϴ�.
 */

public class CustomerTest {

	public static void main(String[] args) {
		
		ArrayList<Customer> list= new ArrayList<Customer>();
		
		Customer lee= new Customer("�̼���");
		Customer shin= new Customer("�Ż��Ӵ�");
		Customer hong= new GoldCustomer("ȫ�浿");
		Customer gok= new GoldCustomer("������");
		Customer kim= new VIPCustomer("������");
		
		list.add(lee);
		list.add(shin);
		list.add(hong);
		list.add(gok);
		list.add(kim);
		
		System.out.println("======== ���� ���� ��� ========");
		for(Customer c: list) {
			System.out.println(c.showCustomerInfo());
		}
		
		int money= 10000;
		System.out.println("======== �������� ���ʽ� ����Ʈ ��� ========");
		for(Customer c: list) {
			System.out.println(c.getCustomerName() + "���� " + c.calcPrice(money) + "�� �����ϼ̽��ϴ�.");
			System.out.println(c.getCustomerName() + "���� ���� ���ʽ� ����Ʈ�� " + c.bonusPoint + "�� �Դϴ�.");
		}
		
		
	}

}
