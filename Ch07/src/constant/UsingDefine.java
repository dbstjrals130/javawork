package constant;

public class UsingDefine {

	public static void main(String[] args) {
		// static이 있는 상수는 클래스 이름으로 직접 접근
		System.out.println("최대값은 " + Define.Max);
		System.out.println("최소값은 " + Define.Min);
		
		System.out.println("수학 과목 코드값은 " + Define.MATH + "입니다.");
		System.out.println("수학 과목 코드값은 " + Define.ENG + "입니다.");
		
		System.out.println("원주율은 " + Define.PI);
		System.out.println("원주율은 " + Math.PI);		//정밀한 값
		
		System.out.println(Define.GOOD_MORNING);

	}

}
