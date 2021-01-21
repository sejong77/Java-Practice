package collection.treeset;

import java.util.Comparator;
import java.util.TreeSet;

class MyCompare implements Comparator<String>{

	@Override
	public int compare(String m1, String m2) {
		return m2.compareTo(m1);
	}
	
}


public class ComparatorTest {

	public static void main(String[] args) {
		
		TreeSet<String> treeSet= new TreeSet<String>(new MyCompare());
		treeSet.add("�̱��");
		treeSet.add("�ֱ��");
		treeSet.add("��ö��");
		
		System.out.println(treeSet);
		
		for(String s: treeSet) {
			System.out.println(s);
		}
		
	}

}
