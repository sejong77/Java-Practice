package chapter4practice;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		/* 1. �����ڿ� �� ���� ������ ������ �� ��Ģ������ ����Ǵ� ���α׷��� ������  (if - else ��)
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("������ �� �� ���ڸ� �Է�(���� ���̿� ��ĭ ����)");
		int num1= scanner.nextInt();
		int num2= scanner.nextInt();
		
		System.out.println("�����ڸ� �Է��Ͻÿ�");
		char op= scanner.next().charAt(0);
		
		int result= 0;
		if(op == '+') {
			result= num1 + num2;
			System.out.println("���� ���: " + num1 + " " + op + " " + num2 +"= " + result);
		}
		else if(op == '-') {
			result= num1 - num2;
			System.out.println("���� ���: " + num1 + " " + op + " " + num2 +"= " + result);
		}
		else if(op == '*') {
			result= num1 * num2;
			System.out.println("���� ���: " + num1 + " " + op + " " + num2 +"= " + result);
		}
		else if(op == '/') {
			result= num1 / num2;
			System.out.println("���� ���: " + num1 + " " + op + " " + num2 +"= " + result);
		}
		else {
			System.out.println("Error");
		}
		
		scanner.close();
		*/
		
		/* 2. �����ڿ� �� ���� ������ ������ �� ��Ģ������ ����Ǵ� ���α׷��� ������  (switch -case ��)  */
		Scanner scanner= new Scanner(System.in);
		System.out.println("���� �� �� ���� �Է��ϼ���(���� ���̿� �� ĭ ����)");
		int num1= scanner.nextInt();
		int num2= scanner.nextInt();
		
		System.out.println("�����ڸ� �Է��ϼ���");
		char op= scanner.next().charAt(0);
		
		switch(op) {
			case '+':
				System.out.println(num1 + " + " + num2 + "= " + (num1+num2));
				break;
				
			case '-':
				System.out.println(num1 + " - " + num2 + "= " + (num1-num2));
				break;
				
			case '*':
				System.out.println(num1 + " x " + num2 + "= " + (num1*num2));
				break;
				
			case '/':
				if(num2 == 0) {
					System.out.println("�и� 0�� �� ���� �����ϴ�.");
				}
				else {
					System.out.println(num1 + " / " + num2 + "= " + (num1/num2));
				}
				break;
				
			default:
				System.out.println("�����ڸ� �ٽ� �Է��ϼ���");
		}
		scanner.close();
		
	}

}
