package chapter5practice;

/*
 ���� ��ü�� ���� ���� �´� Ŭ������ ����� ���� ����� ������
 ���̰� 40��, �̸��� James��� ���ڰ� �ִ�. �� ���ڴ� ��ȥ�� �߰�, �ڽ��� ���� �ֽ��ϴ�.
 
 <��� ���>
 ����: 40
 �̸�: James
 ��ȥ����: true
 �ڳ� ��: 3
 */
public class Task1 {
	int age;
	String name;
	boolean isMarried;
	int numberOfChildren;
	
	public void showPerson() {
		System.out.println("����: " + age);
		System.out.println("�̸�: " + name);
		System.out.println("��ȥ ����: " + isMarried);
		System.out.println("�ڳ� ��: " + numberOfChildren);
	}
	
	
	
	public static void main(String[] args) {
		Task1 person= new Task1();
		person.age= 40;
		person.name= "James";
		person.isMarried= true;
		person.numberOfChildren= 3;
		
		person.showPerson();
		
	}

}
