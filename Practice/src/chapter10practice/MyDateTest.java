package chapter10practice;

/* ��¥�� ������ Ŭ���� MyDate�� �ִ�.
 
 ��¥�� ������ equals()�޼����� ����� true�� �ǵ��� �����ϰ�
 HashCode�� ���������� hashCode()�޼��带 �����ض�
 */


public class MyDateTest {

	public static void main(String[] args) {
		
		MyDate date1= new MyDate(2020, 12, 11);
		MyDate date2= new MyDate(2020, 12, 11);
		
		System.out.println(date1 == date2);
		System.out.println(date1.equals(date2));
		
		System.out.println(date1.hashCode());
		System.out.println(date2.hashCode());
		System.out.println(date1.hashCode() == date2.hashCode());
		
	}

}
