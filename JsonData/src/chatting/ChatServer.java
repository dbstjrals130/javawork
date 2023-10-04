package chatting;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ChatServer {
	
	// 필드
	ServerSocket serverSocket;
	
	// 스레드 풀
	ExecutorService threadPool = Executors.newFixedThreadPool(100);
	
	// 채팅방 - HashMap(싱글스레드), Hashtable(멀티스레드)
	//Map<String, SocketClient> chatRoom = new Hashtable<>();
	//동기화된 컬렉션 이용
	Map<String, SocketClient> chatRoom =
			Collections.synchronizedMap(new HashMap<>());
	
	public void start() {
		try {
			serverSocket = new ServerSocket(6000);
			System.out.println("[서버] 시작됨");
			
			//항상 연결 대기 - 스레드 만들기
			Thread thread = new Thread() {
				@Override
				public void run() {
					while(true) {
						try {
							//연결 수락 및 소켓 객체 생성
							Socket socket = serverSocket.accept();
							//소켓 클라이언트 객체 생성
							SocketClient sc = new SocketClient(ChatServer.this, socket);
						} catch (IOException e) {
							e.printStackTrace();
							
						}
					}
				}
			};
						
			thread.start();		
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void stop() {
		try {
			serverSocket.close();
			threadPool.shutdown();
			
			//chatRoom.values();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		ChatServer chatServer = new ChatServer();
		chatServer.start();
		
		
		
	}

}
