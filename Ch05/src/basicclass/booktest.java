package basicclass;

public class booktest {

	public static void main(String[] args) {

		book book1 = new book(100, "개미");
		System.out.println(book1.toString());
		
		//String msg = "개미";
		String msg = new String("개미");
		System.out.println(msg.toString());

	}

}
