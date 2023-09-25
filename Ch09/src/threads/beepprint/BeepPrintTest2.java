package threads.beepprint;

import java.awt.Toolkit;

public class BeepPrintTest2 {

	public static void main(String[] args) {
		//beepTask 객체 생성(작업 스레드)
		Runnable beepTask = new BeepTask();
		//작업 스레드 객체 생성
		Thread thread = new Thread(beepTask);
		thread.start();   //스레드 시작{실행}

		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=1; i<=5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
		
	}

}
