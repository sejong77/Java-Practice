package chapter5practice.coffee;

public class Person {
	
	private String name;
	private int money;
	
	public Person() {
		
	}
	
	public Person(String name, int money) {
		this.name= name;
		this.money= money;
	}

	public void buyStarCoffee(StarCoffee sCoffee, int money) {
		
		String message= sCoffee.brewing(money);
		this.money -= money;
		
		if(message != null) {
			System.out.println(name + " ���� " + money +"���� ����" + message + this.money +"�� ���ҽ��ϴ�.");
		}
	}
	
	public void buyBeanCoffee(BeanCoffee bCoffee, int money) {
		String message= bCoffee.brewing(money);
		this.money -= money;
		
		if(message != null) {
			System.out.println(name + " ���� " + money +"���� ����" + message + this.money +"�� ���ҽ��ϴ�.");
		}
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
	
	
}
