package collection.quene;

import java.util.LinkedList;
import java.util.Queue;

public class MessageQueneTest {

	public static void main(String[] args) {
		// Queue를 구현한 LinkedList를 자료 구조로 사용
		Queue<Message> msgQueue = new LinkedList<>();

		//Message 객체 생성 - offer()
		Message email = new Message("email", "이순신");
		Message sms = new Message("sms", "양만춘");
		Message katalk = new Message("katalk", "을지문덕");
		
		//객체 저장
		msgQueue.offer(email);
		msgQueue.offer(sms);
		msgQueue.offer(katalk);
		
		//객체 꺼내기(삭제) - poll()
		//반복 - 확인(isEmpty())
		while(!msgQueue.isEmpty()) {
			Message message = msgQueue.poll();  //1개 꺼냄
			switch(message.command) {
			case "email":
				System.out.println(message.to + "님에게 메일을 보냅니다.");
				break;
			case "sms":
				System.out.println(message.to + "님에게 SMS를 보냅니다.");
				break;
			case "katalk":
				System.out.println(message.to + "님에게 katalk를 보냅니다.");
				break;
			}
		}
		
		
	}

}
