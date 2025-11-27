package getter_setter;

public class Car {
	
	// private 접근제한자 : 같은 클래스 내에서만 접근가능
	private double speed;
	private boolean stop;
	
	// getter&setter
	
	// 접두사에 get과 set이 붙은 메서드를 의미한다
	
	// setter
	// 값을 세팅한다는 기능을 가진 메서드
	// 메서드는 set 필드명(메개변수){} 로 작성하는것이  일반적이다
	// setter를 호출하면서 필드에 값을 세팅한다
	
	
	// 함수를 호출하면서 넘어온 인자를 매개변수에 담아서 필드로 전달
	public void setSpeed(double speed) {
		if(speed < 0) {
			speed = 0;
			return;
		}
		this.speed = speed;
	}
	
	// getter
	// 필드의 값을 조회할 때 사용한다
	// 필드의 타입 get필드명(){...}
	public double getSpeed() {
		return this.speed;
	}
	
	public void setStop(boolean stop) {
		this.stop = stop;
	}
	
	// 필드 타입이 boolean 일때 getter ->is필드명()
	public boolean isStop() {
		return this.stop;
	}
	
	
}

