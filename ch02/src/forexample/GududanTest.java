package forexample;

public class GududanTest {

	public static void main(String[] args) {
		// 단일 for ()
		/*
		  3 * 1 = 3
		  3 * 2 = 6
		  3 * 3 = 9

		  3 * 8 = 24
		  3 * 9 = 27
		 */

		int dan = 4;
		for(int i=1; i<=9; i++) {
			System.out.println(dan + " * " + i + " = " + (dan*i));
		}
			
	}

}
