package string;

public class StringTest2 {

	public static void main(String[] args) {

		String java= new String("java");
		String android= new String("android");
		System.out.println(System.identityHashCode(java));
		
		java= java + android;
		// java= java.concat(android); ���� �ڵ�� �ǹ̴� ����
		
		System.out.println(java);
		System.out.println(System.identityHashCode(java));
		
		// ó�� java�� HashCode�� �ι� ° java�� HashCode�� �ٸ��� ����� �ȴ�.
		// �� �ǹ̴� java�� android�� ��ģ �� ������ java�� ���ο� �޸𸮰� �Ҵ��� �� �� �� �� �ִ�.
		
		
		
		
	}

}
