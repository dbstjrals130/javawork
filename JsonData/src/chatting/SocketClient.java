package chatting;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

public class SocketClient {

	ChatServer chatServer;
	Socket socket;
	String clientIp;
	String chatName;
	DataInputStream dis;
	DataOutputStream dos;
	
	public SocketClient(ChatServer chatServer, Socket socket) {
		try {
			this.chatServer = chatServer;
			this.socket = socket;
			dis = new DataInputStream(socket.getInputStream());
			dos = new DataOutputStream(socket.getOutputStream());
			
			InetSocketAddress isa =
					(InetSocketAddress) socket.getRemoteSocketAddress();
			this.clientIp = isa.getHostString();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	//데이터 받기(수신) : JSON 받기
	public void receive() {
		chatServer.threadPool.execute(() -> {
			while(true) {
				try {
					String receiveJson = dis.readUTF();
					
					//JSON 파싱
					//명령(Command) 속성의 구조
					//{"command" : "incomming", "data" : "chatName"}
					//{"command" : "message", "data" : "xxxx(메시지)"}
					JSONObject jsonObject = new JSONObject(receiveJson);
					
					String command = jsonObject.getString("command");
					switch(command) {
					case "incoming" :
						this.chatName = jsonObject.getString("data");
						chatServer.sendToAll(this, "입장하셨습니다.");
						chatServer.addSocketClient(this);
						break;
					case "message" :
						String message = jsonObject.getString("data");
						chatServer.SendToAll(this, message);
						break;
					}
					
				}	catch(IOException e) {
					//클라이언트 소켓이 종료되면 연결이 끊김
					chatServer.sendToAll(this, "나가셨습니다.");
					chatServer.removeSocketClient(this); //현재 소켓 클라이언트
				}
				
			}
		});
	}

}
