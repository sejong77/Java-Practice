package thispart;

public class Person {

	public String name;
	public int age;
	
	public Person() {
		this("No name", 3);
	}
	
	public Person(String name, int age) {
		this.name= name;
		this.age= age;
	}
	
	public void showInfo() {
		System.out.println("�̸�: " + name + ", ����: " + age);
	}
	
	public Person getSelf() {
		return this;
	}
}
