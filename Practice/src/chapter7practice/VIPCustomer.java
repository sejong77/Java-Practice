package chapter7practice;

public class VIPCustomer extends Customer{

	private int agentID;
	public double salesRatio;
	
	public VIPCustomer(String name) {
		this.customerName= name;
		
		customerGrade= "VIP";
		bonusRatio= 0.05;
		salesRatio= 0.1;
		setAgentID(12345);
	}

	public int calcPrice(int price) {
		bonusPoint+= price * bonusRatio;
		
		return price - (int) (price * salesRatio);
	}
	
	public String showCustomerInfo() {
		return customerName + " ���� ����� " + customerGrade + "�̸�, ���ʽ� ����Ʈ�� " + bonusPoint + "�� �Դϴ�. ��� ���� ��ȣ�� "
				+ getAgentID() + "�Դϴ�.";
	}
	
	public int getAgentID() {
		return agentID;
	}

	public void setAgentID(int agentID) {
		this.agentID = agentID;
	}
	
}
