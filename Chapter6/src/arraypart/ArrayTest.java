package arraypart;

public class ArrayTest {

	public static void main(String[] args) {

		int arr[]= new int[10];
		int total= 0;
		
		for(int i=0, num= 1; i<arr.length; i++, num++) {
			arr[i]= num;
		}
		
		for(int i=0; i<arr.length; i++) {
			total += arr[i];
		}
		
		System.out.println(total);
		
		double dArr[]= new double[5];
		int count= 0;
		
		dArr[0]= 1.1; count++;
		dArr[1]= 2.2; count++;
		dArr[2]= 3.3; count++;
		
		double mTotal= 1;
		for(int i=0; i<count; i++) {
			mTotal += dArr[i];
		}
		System.out.println(mTotal);
		
	}

}
