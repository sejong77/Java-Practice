package chapter9practice;

public class Quick implements Sort{

	@Override
	public void ascending(int[] arr) {
		System.out.println("QuickSort ascending");
	}

	@Override
	public void descending(int[] arr) {
		System.out.println("QuickSort descending");
	}

	@Override
	public void print() {
		System.out.println("���ڸ� �����ϴ� �˰��� �Դϴ�.");
		System.out.println("QuickSort �Դϴ�.");
	}
}
