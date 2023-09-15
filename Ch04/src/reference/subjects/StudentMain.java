package reference.subjects;

public class StudentMain {

	public static void main(String[] args) {
		//std1, std2 생성하기
		/*student std1 = new student(101, "홍길동");
		
		//과목 추가
		std1.KoreanSubject("국어", 90);
		std1.mathSubject("수학", 83);
		
		//학생 정보 출력
		std1.showStudentInfo();
		
		student std2 = new student(102, "강아지");
				
		std2.KoreanSubject("국어", 90);
		std2.mathSubject("수학", 95);
		
		std2.showStudentInfo();*/
		
		//객체 배열
		//객체 생성
		student[] students = {
				new student(101, "홍길동"),
				new student(102, "강아지"),
				new student(103, "임꺽정"),					  
		};
		
		//점수 저장
		students[0].KoreanSubject("국어", 90);
		students[0].mathSubject("수학",83);
		
		students[1].KoreanSubject("국어", 80);
		students[1].mathSubject("수학",77);
		
		students[2].KoreanSubject("국어", 95);
		students[2].mathSubject("수학",90);
		
		//전체 출력
		for(int i = 0; i < students.length; i++) {
			students[i].showStudentInfo();
		}
		System.out.println("=======================");

		//항상 for
	}

}