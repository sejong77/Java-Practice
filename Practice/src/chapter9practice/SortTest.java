package chapter9practice;

import java.io.IOException;

/* ������ ���� ���� ���� ���� �˰����� �Է¿� ���� ����� �� �ֵ��� �����ض�
 	<��� ���>
 	���Ĺ���� �����ϼ���.
	B: BubbleSort
	H: HeapSort
	Q: QuickSort
	h
	HeapSort ascending
	HeapSort descending
	���ڸ� �����ϴ� �˰��� �Դϴ�.
	HeapSort �Դϴ�.
 */

public class SortTest {

	public static void main(String[] args) throws IOException {
		
		System.out.println("���Ĺ���� �����ϼ���.");
		System.out.println("B(b): BubbleSort");
		System.out.println("H(h): HeapSort");
		System.out.println("Q(q): QuickSort");
		
		int ch= System.in.read();
		
		Sort sort= null;
		
		if(ch == 'B' || ch == 'b') {
			sort= new Bubble();
		}
		else if(ch == 'H' || ch == 'h') {
			sort= new Heap();
		}
		else if(ch == 'Q' || ch == 'q') {
			sort= new Quick();
		}
		else {
			System.out.println("�������� �ʴ� ����Դϴ�.");
		}
		
		int arr[]= new int[10];
		
		try {
			sort.ascending(arr);
			sort.descending(arr);
			sort.print();
		} catch(Exception e) {
			System.out.println("�ٽ� �õ��ϼ���");
			System.out.println(e);
		}
	
	}

}
