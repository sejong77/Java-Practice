package chapter14practice;

/*���ڷ����� ������ Ȱ���� Ŀ�Ǹ� ����� ����

�Ƹ޸�ī��
��= �Ƹ޸�ī�� + ����
��īĿ�� = �Ƹ޸�ī�� + ���� + ��ī�÷�
����ũ�� ��īĿ��= �Ƹ޸�ī�� + ���� + ��ī�÷� + ���� ũ��
*/

public class CoffeeTest {

	public static void main(String[] args) {
		
		Americano americano= new Americano();
		americano.brewing();
		
		System.out.println("\n");
		System.out.println("<Latte>");
		Latte latte= new Latte(americano);
		latte.brewing();
		
		System.out.println("\n");
		System.out.println("<Mocha Coffee>");
		Mocha mocha= new Mocha(new Latte(new Americano()));
		mocha.brewing();
		
		System.out.println("\n");
		System.out.println("<Whipping Cream Mocha Coffee>");
		WhippingCream whipping= new WhippingCream(new Mocha(new Latte(new Americano())));
		whipping.brewing();
		
		
	}

}
