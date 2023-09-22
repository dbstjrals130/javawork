package collection.quene;

public class Message {
	
	String command;	 // 수행 - 이메일, SMS, 카카오톡
	String to;		 // 대상
	
	//생성자
	Message(String command, String to) {
		this.command = command;
		this.to = to;
	}

}
