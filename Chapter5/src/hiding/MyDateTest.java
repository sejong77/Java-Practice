package hiding;

/* ���� ���ǿ� �´� MyDate Ŭ������ ������
 
 - day, month, year ������ private���� ����
 - �� ������ getter, setter�� public���� ����
 - MyDate(int year, int month, int day) �����ڸ� ����
 - public boolean isValid() �޼��带 ����� ��¥�� ��ȿ���� Ȯ��
 - MyDateTest Ŭ�������� ������ MyDate ��¥�� ��ȿ���� Ȯ��
 */

public class MyDateTest {

	public static void main(String[] args) {

		MyDate date1= new MyDate(2002, 6, 12);
		MyDate date2= new MyDate(2001, 2, 29);
		
		date1.isValid();
		date2.isValid();
	}

}
