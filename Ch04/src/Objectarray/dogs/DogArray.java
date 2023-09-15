package Objectarray.dogs;

public class DogArray {

	public static void main(String[] args) {
		// Dog 인스턴스 4개를 생성해서 배열에 저장하고
		// 정보를 출력하세요.(get()함수 사용)
		
		Dog[] dogs = new Dog[4];
		
		//배열에 저장(입력)
		dogs[0] = new Dog("탱이", "시바견");
		dogs[1] = new Dog("오쏠이", "포메라니안");
		dogs[2] = new Dog("호야", "리트리버");
		dogs[3] = new Dog("백구", "진돗개");
		
		for(int i=0; i<dogs.length; i++) {
			System.out.println(dogs[i].getName() + ", "
								+dogs[i].getType());
		}
		
		System.out.println("===================");
	
		//향상된 for문
		for(Dog dog : dogs) {
			System.out.println(dog.getName() + ", " + dog.getType());
		}

	}

}
