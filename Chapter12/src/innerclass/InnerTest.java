package innerclass;

import innerclass.OutClass.InClass;

class OutClass {
	
	private int num= 10;
	private static int sNum= 20;
	private InClass iClass;
	
	public OutClass() {
		iClass= new InClass();
	}
	
	class InClass {
		int iNum= 100;
		
		void test() {
			System.out.println(iNum);
			System.out.println(sNum);
			System.out.println(num);
		}
	}
	
	public void usingMethod() {
		iClass.test();
	}
	
	
	static class SinClass {
		int isNum= 30;
		static int issNum= 50;
		
		void test() {
			System.out.println(isNum);
			System.out.println(issNum);
			System.out.println(sNum);
		}
		
		static void sTest() {
			System.out.println(issNum);
			System.out.println(sNum);
		}
	}
	
}


public class InnerTest {

	public static void main(String[] args) {
		
		// 1. �ܺ� Ŭ�������� �ν��Ͻ� ���� Ŭ������ �ִ� �޼��� ����ϱ�
		OutClass oClass= new OutClass();
		oClass.usingMethod();
		
		System.out.println();
		// 2. �ν��Ͻ� ���� Ŭ������ �ִ� �޼��� ȣ���ϱ�
		OutClass.InClass iClass= oClass.new InClass();
		iClass.test();

		System.out.println();
		// 3. ����(static) ���� Ŭ������ �ִ� �޼��� ȣ���ϱ�
		OutClass.SinClass siClass= new OutClass.SinClass();
		siClass.test();
		System.out.println();
		
		OutClass.SinClass.sTest();
		
	}

}
