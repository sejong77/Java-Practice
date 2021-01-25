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
		return customerName + " 님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " + bonusPoint + "점 입니다.";
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
