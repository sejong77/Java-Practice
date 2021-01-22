package chapter6practice.arraylist1;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Student {
	
	private String name;
	
	ArrayList<Subject> sList;
	
	public Student(String name) {
		this.name= name;
		sList= new ArrayList<Subject>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void addSubject(String subjectName, int score) {
		Subject subject= new Subject(subjectName, score);
		sList.add(subject);
	}
	
	public void showStudentInfo() {
		DecimalFormat form= new DecimalFormat("#.##");
		int total= 0;
		for(Subject s: sList) {
			total += s.getScore();
			System.out.println("�л� " + this.name +"���� " + s.getSubjectName() +" ���� ������ " + s.getScore() + "�� �Դϴ�.");
		}
		String average= form.format((double) total / sList.size());
		System.out.println("�л� " + this.name + "���� ������ " + total +"�� �̰�, ����� " + average + "�� �Դϴ�.");
	}
	
	
	
}
