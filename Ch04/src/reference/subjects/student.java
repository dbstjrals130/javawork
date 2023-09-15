package reference.subjects;

public class student {
	//필드
	int studentId;		//학번
	String studentName; //이름
	Subject Korean;		//국어 과목(참조)
	Subject math;
	
	//생성자
	public student (int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
		Korean = new Subject();		// Korean 객체 생성
		math = new Subject();
	}
	
	//국어 과목 추가 메서드 정의
	public void KoreanSubject(String name, int score) {
		Korean.setSubjectName(name);
		Korean.setScorePoint(score);
	}
	
	//수학 과목
	public void mathSubject(String name, int score) {
		math.setSubjectName(name);
		math.setScorePoint(score);
	}
	
	//학생의 정보 출력
	public void showStudentInfo() {
		System.out.println(studentName + "의 " + Korean.getSubjectName() + 
				" 점수는 " + Korean.getScorePoint() + "점 입니다.");
		System.out.println(studentName + "의 " + math.getSubjectName() + 
				" 점수는 " + math.getScorePoint() + "점 입니다.");
	}
	
}
