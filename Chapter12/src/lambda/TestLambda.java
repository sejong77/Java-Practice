package lambda;

@FunctionalInterface
interface Printing {
	
	public void print(String str); 
}


public class TestLambda {

	public static void main(String[] args) {
		
		Printing lambdaStr= s -> System.out.println(s);
		lambdaStr.print("Hello~");
		
		lambdaPrint("�Ű������� ����!");
		
		Printing p= returnPrint();
		p.print("��ȯ ������ ����");
		
	}
	
	public static void lambdaPrint(String str) {
		System.out.println(str);
	}
	
	public static Printing returnPrint() {
		return s-> System.out.println(s);
	}
	
	

}
