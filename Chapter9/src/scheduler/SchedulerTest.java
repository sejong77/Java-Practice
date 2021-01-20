package scheduler;

import java.io.IOException;

public class SchedulerTest {

	public static void main(String[] args) throws IOException {

		System.out.println("��ȭ ���� �Ҵ� ����� �����ϼ���");
		System.out.println("R(r): �Ѹ� ���ʴ��");
		System.out.println("L(l): ��Ⱑ ���� ���� �켱");
		System.out.println("P(p): �켱������ ���� ���켱, ���õ� ���� ����");
		
		int ch= System.in.read();
		
		Scheduler scheduler= null;
		
		if(ch== 'R' || ch == 'r') {
			scheduler= new RoundRobin();
		}
		else if(ch == 'L' || ch == 'l') {
			scheduler= new LeastJob();
		}
		else if(ch == 'P' || ch == 'p') {
			scheduler= new PriorityAllocation();
		}
		else {
			System.out.println("�������� �ʴ� ����Դϴ�.");
		}
		
		try {
			scheduler.getNextCall();
			scheduler.sendCallToAgent();
		} catch(NullPointerException e) {
			System.out.println("�ٽ� �õ��ϼ���");
		}
	}

}
