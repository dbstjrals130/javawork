package data;

public class DataTypeEx {

	public static void main(String[] args) {
		// int, long의 사용
		// int형 크기 - 4Byte(32bit) -21억 ~ 21억
		// long형 - 8Byte(64bit)
		
		int num1 = 1234567890; // 12억
		long num2 = 12345678900L; // 숫자 뒤에 대문자 'L' or '1'을 붙여야 함

		System.out.println(num1);
		System.out.println(num2);
		
	}

}
