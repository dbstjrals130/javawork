package reference.subjects;

//Subject 자료형 정의
public class Subject {
	
	//필드
	private String subjectName;		//과목 이름
	private int scorePoint;			//과목 점수
	
	//getter, setter
	//과목이름 입력
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	
	//과목 이름 출력
	public String getSubjectName() {
		return subjectName;
	}
	
	//점수 입력
	public void setScorePoint(int scorePoint) {
		this.scorePoint = scorePoint;
	}
	
	//점수 출력
	public int getScorePoint() {
		return scorePoint;
	}
}
