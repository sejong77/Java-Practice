package chapter5practice;
/*
 <�ֹ� ����>
 �ֹ� ��ȣ: 201907210001
 �ֹ��� ���̵�: abc123
 �ֹ� ��¥: 2019�� 7�� 21��
 �ֹ��� �̸�: ȫ���
 �ֹ� ��ǰ ��ȣ: PD0345-12
 ��� �ּ�: ����� �������� ���ǵ��� 20����
 
 �� �ֹ� ������ ������ �� �ִ� Ŭ������ ����� �ν��Ͻ��� ������ �� ���� ���� �������� ����غ���
 */
public class Task2 {
	public long orderNumber;
	public String orderID;
	public String orderDate;
	public String orderName;
	public String productNumber;
	public String address;
	
	public void showOrder() {
		System.out.println("�ֹ� ��ȣ: " + orderNumber);
		System.out.println("�ֹ� ���̵�: " + orderID);
		System.out.println("�ֹ� ��¥: " + orderDate);
		System.out.println("�ֹ��� �̸�: " + orderName);
		System.out.println("�ֹ� ��ǰ ��ȣ: " + productNumber);
		System.out.println("��� �ּ�: " + address);
	}
	
	
	public static void main(String[] args) {
		Task2 person= new Task2();
		person.orderNumber= 201907210001L;
		person.orderID= "abc123";
		person.orderDate= "2019�� 7�� 21��";
		person.orderName= "ȫ���";
		person.productNumber= "PD0345-12";
		person.address= "����� �������� ���ǵ��� 20����";
		
		person.showOrder();
		
	}

}
