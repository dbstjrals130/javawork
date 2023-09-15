package Singleton.student;

public class StudentMain {

	public static void main(String[] args) {
		School school = School.getInstance();
		School school2 = School.getInstance();
		
		Student Taengtaeng = school.createStudent();
		Student Chokom = school.createStudent();
		Student Yeowoo = school.createStudent();
		
		System.out.println("학번 : " + Taengtaeng.getStundentNum());
		System.out.println("학번 : " + Chokom.getStundentNum());
		System.out.println("학번 : " + Yeowoo.getStundentNum());

		//학교 객체의 주소
		System.out.println(school);
		System.out.println(school2
				);
		
		//학생 객체의 주소
		System.out.println(Taengtaeng);
		System.out.println(Chokom);
		System.out.println(Yeowoo);
	}

}
