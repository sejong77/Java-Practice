package chapter12practice;

import java.util.ArrayList;
import java.util.List;

/* ex)
 ��Ű�� ������ ������ ������ �ִ�. ���� ����� 15�� �̻��� 100����, �� �̸��� 50�����̴�.
 ������ ���� �� �� ���� ������ ���ٰ� ���� �� ���� �� ��ܿ� ���� ����� ��Ʈ���� Ȱ���� ��������
 
 <�� ����Ʈ>
 �� ��ȣ	�̸�		����		���
 1			�̼���	40		100
 2			������	20		100
 3			ȫ�浿	13		50
 
 1) �� ���(�̸�)�� ���
 2) ������ �� ����� ����ؼ� ���
 3) �� �� 20�� �̻��� ����� �̸� ������(������ ��) �����Ͽ� ���
 */

public class TravelTest {

	public static void main(String[] args) {
		
		TravelCustomer lee= new TravelCustomer("�̼���", 40, 100);
		TravelCustomer kim= new TravelCustomer("������", 20, 100);
		TravelCustomer hong= new TravelCustomer("ȫ�浿", 13, 50);
		TravelCustomer shin= new TravelCustomer("�Ż��Ӵ�", 17, 100);
		TravelCustomer ju= new TravelCustomer("�ָ�", 28, 100);
		
		List<TravelCustomer> list= new ArrayList<TravelCustomer>();
		list.add(ju);
		list.add(hong);
		list.add(shin);
		list.add(kim);
		list.add(lee);
		
		System.out.println(list);
		
		// 1. �� ���(�̸�) ���
		list.stream().map(c->c.getName()).forEach(s->System.out.println(s));
		
		// 2. ������ �� ���� ����� ����ؼ� ���
		int total= list.stream().mapToInt(c->c.getPrice()).sum();
		System.out.println("�� ���: " + total + "����");
		
		//3. �� �� 20�� �̻��� ����� �̸� ������(������ ��) �����Ͽ� ���
		list.stream().filter(c->c.getAge()>=20).map(c->c.getName()).sorted().forEach(s->System.out.println(s));
		
		
		
	}

}
