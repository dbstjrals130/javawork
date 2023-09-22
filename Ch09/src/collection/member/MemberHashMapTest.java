package collection.member;

public class MemberHashMapTest {

	public static void main(String[] args) {
		
		MemberHashMap memberMap = new MemberHashMap();
		
		//회원 추가
		memberMap.addMember(new Member(1001, "이순신"));
		memberMap.addMember(new Member(1002, "양만춘"));
		memberMap.addMember(new Member(1003, "을지문덕"));
		
		//키는 중복 불허, 값은 변경됨
		
		memberMap.addMember(new Member(1002, "강감찬"));  
		
		//회원 목록
		memberMap.showAllMember();

	}

}
