package chapter7practice;

public class Customer {

	protected String customerGrade;
	protected String customerName;
	
	public int bonusPoint;
	public double bonusRatio;
	
	public Customer() {
		
	}
	
	public Customer(String customerName) {
		this.customerName= customerName;
		
		bonusRatio= 0.01;
		customerGrade= "SILVER";
	}
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price;
	}

	public String showCustomerInfo() {
		return customerName + " ���� ����� " + customerGrade + "�̸�, ���ʽ� ����Ʈ�� " + bonusPoint + "�� �Դϴ�.";
	}
	
	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
}
