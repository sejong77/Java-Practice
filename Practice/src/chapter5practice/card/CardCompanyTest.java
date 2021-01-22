package chapter5practice.card;

/* static�� singleton pattern ����
 
 - ī�� ȸ�簡 �ִ�. 
 - ī��ȸ��� ������ ��ü�̰�, �� ȸ�翡���� ī�带 �߱��ϸ� �׻� ������ȣ�� �ڵ����� �����ȴ�.
 - 10001���� �����ؼ� ī�尡 ������ �� ���� 10002, 10003������ �����Ѵ�.
 - Card Ŭ������ CardCompany Ŭ������ �����϶�
 */

public class CardCompanyTest {

	public static void main(String[] args) {
		
		CardCompany company= CardCompany.getInstance();
		
		Card card1= company.getCard();
		Card card2= company.getCard();
		
		System.out.println(card1.getCardNumber());
		System.out.println(card2.getCardNumber());
		
	}

}
