package ifexample;

public class LimitSpeedTest {

	public static void main(String[] args) {
		// if문
		// 제한 속도(limitspeed) 50이면 "제한 속도 위반"
		/* 
		 * if(비교문) { //비교문이 true이면 실행문이 작동함
		      실행문1;
 		   }else{ //false이면 실행문2 작동
		      실행문2;
		   }
		 */
		int limitspeed = 45;
		
		/* 단독 if문
		if(limitspeed >= 50 ) {System.out.println("제한 속도 위반!");		}
		
		System.out.println("시속 " + limitspeed + "km입니다.");

        */
		
		//if ~ else 구문
		if(limitspeed >= 50) {System.out.println("제한 속도 위반! 과태료 10만원 부과 대상!");
		}
		else {System.out.println("안전 속도 준수!"); 
		}
		System.out.println("시속 " + limitspeed + "km입니다.");
	}

}
