package chapter9practice;

public class Bubble implements Sort{

	@Override
	public void ascending(int[] arr) {
		System.out.println("BubbleSort ascending");
	}

	@Override
	public void descending(int[] arr) {
		System.out.println("BubbleSort descending");
	}

	@Override
	public void print() {
		System.out.println("���ڸ� �����ϴ� �˰��� �Դϴ�.");
		System.out.println("BubbleSort �Դϴ�.");
	}

}
