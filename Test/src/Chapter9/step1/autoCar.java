package Chapter9.step1;

public class autoCar extends Bus{
	
	public autoCar() {}
	
	public void run() {
		System.out.println("차가 달립니다.");
	}
	
	public void refuel() {
		System.out.println("휘발유를 주유합니다.");
	}
	
	public void load() {
		System.out.println("짐을 싣습니다.");
	}
	
	public void stop() {
		System.out.println("차가 멈춥니다.");
	}

}
