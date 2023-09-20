package basicclass;

public class Person {
	//필드
	private String name;
	private int age;
	
	//생성자
	public Person() {
		
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//메서드
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	
	
	
}
