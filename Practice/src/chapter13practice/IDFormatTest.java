package chapter13practice;

/* 
�Ű� ������ ���޵� ���̵� null �̰ų� 8�̸� �̰ų� 20�� �ʰ��� ��� ���ܸ� �߻� ��Ű�� ���� Ŭ������ ���� ����� ���ܸ� �߻��ض�
*/

public class IDFormatTest {
	
	private String userID;
	
	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) throws IDFormatException{
		if(userID == null) {
			throw new IDFormatException("���̵�� null�� �� �� �����ϴ�.");
		}
		else if(userID.length()<8 || userID.length()>20) {
			throw new IDFormatException("���̵��� ���̸� 8�̻� 20���Ϸ� ���߼���.");
		}
		else {
			System.out.println("���̵�: " + userID);
		}
	}

	public static void main(String[] args) {
		
		IDFormatTest idfTest= new IDFormatTest();
		
		String id= null;
		
		try {
			idfTest.setUserID(id);
			
		} catch(IDFormatException e) {
			System.out.println(e);
		}
		
		id= "asfgsdfsdffgd";
		
		try {
			idfTest.setUserID(id);
			
		} catch(IDFormatException e) {
			System.out.println(e);
		}
		
	}

}
