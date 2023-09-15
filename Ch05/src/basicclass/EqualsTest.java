package basicclass;

public class EqualsTest {

	public static void main(String[] args) {
		String name1 = new String("우영우");
		String name2 = new String("우영우");
		
		//인스턴스의 주소 비교
		//해쉬 코드 - 메모리 주소(10진수)
		System.out.println(System.identityHashCode(name1));
		System.out.println(System.identityHashCode(name2));
		
		
		System.out.println(name1);
		System.out.println(name2);
		System.out.println(name1 == name2);			//false가 나오는 것은 당연
		System.out.println(name1.equals(name2));	//문자열 비교 - true
		
		System.out.println("========================================");
		book book1 = new book(100, "개미");
		book book2 = new book(100, "개미");
		
		System.out.println(book1 == book2); 		//주소 - false
		System.out.println(book1.equals(book2)); 	//문자열 비교 - false
	}

}
