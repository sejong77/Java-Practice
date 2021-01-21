package collection.treeset;

import java.util.Comparator;

public class Member implements Comparator<Member>{

	private int memberID;
	private String memberName;
	
	public Member() {
		
	}
	
	public Member(int memberID, String memberName) {
		this.memberID= memberID;
		this.memberName= memberName;
	}

	public String toString() {
		return memberName +" ȸ�� ���� ID�� " + memberID +"�Դϴ�.";
	}
	
	public int getMemberID() {
		return memberID;
	}

	public void setMemberID(int memberID) {
		this.memberID = memberID;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	@Override
	public int compare(Member m1, Member m2) {
		return m1.memberID - m2.memberID;
	}

	/*@Override
	public int compareTo(Member m) {
		return this.memberName.compareTo(m.getMemberName());
	} */
	
	
	
	

	
	
	
	
}
