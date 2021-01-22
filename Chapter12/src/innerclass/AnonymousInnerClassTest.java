package innerclass;

class Outer2 {
	
	private int outNum= 10;
	private static int sNum= 20;
	
	public Runnable getRunnable(int i) {
		int num= 100;
		
		return new Runnable() {

			@Override
			public void run() {
				System.out.println(outNum);
				System.out.println(sNum);
				System.out.println(i);
				System.out.println(num);
			}
			
		};
	}

	Runnable runner= new Runnable() {

		@Override
		public void run() {
			System.out.println("�������̽� Ÿ���� ������ new Ű���带 ����Ͽ� �͸� ���� Ŭ���� ����");
		}
		
	};
	
	
	
}


public class AnonymousInnerClassTest {

	public static void main(String[] args) {
		
		Outer2 oClass= new Outer2();
		
		Runnable runnable= oClass.getRunnable(30);
		runnable.run();
		
		oClass.runner.run();
		
		
	}

}
