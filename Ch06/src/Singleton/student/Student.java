package Singleton.student;

public class Student {
	
	private static int studentNum = 100;
	private int SchoolNum;
	
	public Student() {
		studentNum++;
		SchoolNum = studentNum;
	}
	
	public int getStundentNum() {
		return SchoolNum;
	}

}
