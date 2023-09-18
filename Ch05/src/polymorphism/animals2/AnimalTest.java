package polymorphism.animals2;

class Animal {
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

class Human extends Animal {

	@Override
	public void move() {
		System.out.println("사람이 두 발로 걷습니다.");
	}
	
	public void readBook() {
		System.out.println("사람이 책을 읽습니다.");
	}
	
}

class Tiger extends Animal{

	@Override
	public void move() {
		System.out.println("호랑이가 네 발로 뜁니다.");
	}
	
	public void Hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
	
}

class Eagle extends Animal {

	@Override
	public void move() {
		System.out.println("독수리가 하늘을 날아갑니다.");
	}
	
	public void flying() {
		System.out.println("독수리가 날개를 펴고 멀리 날아갑니다.");
	}
	
}


public class AnimalTest {
	
	public void moveAnimal(Animal animal) {
		animal.move();
	}
	

	public static void main(String[] args) {
		
		AnimalTest aTest = new AnimalTest();
		
		//Animaml 타입으로 객체 생성(다형성) - 자동 형변환
		Animal animal = new Human();
		
		//Animal의 move() 메서드 호출
		//moveAnimal() 호출
		aTest.moveAnimal(new Human());
		aTest.moveAnimal(new Tiger());
		
		System.out.println("**** 원래형으로 다운 캐스팅 ****");
		
		Animal[] animals = new Animal[3];
		
		animals[0] = new Human();
		animals[1] = new Tiger();
		
		
		//강제 형변환 - instanceof 키워드 사용
		for(int i=0; i < animals.length; i++) {
		if(animals[i] instanceof Human) { //
			Human human = (Human)animals[i];	//자식타입 = (자식)부모타입
			human.readBook();
		}else if(animals[i] instanceof Human) {
			Tiger tiger = (Tiger)animals[i];
		}
		}

	}

}
