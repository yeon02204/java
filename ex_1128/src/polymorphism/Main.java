package polymorphism;


public class Main {
	public static void main(String[] args) {

		Car myCar = new Car();

		// car 클래스의 필드인 tire에 Tire 객체를 대입
		myCar.tire = new Tire();
		myCar.run();
		
		// HankookTire 객체를 대입
		myCar.tire = new HankookTire();
		myCar.run();
		
		myCar.tire = new KumhoTire();
		myCar.run();
		
		Driver driver = new Driver();
			
		// Bus bus = new Bus();
		// driver.drive(bus);
		
		driver.drive(new Bus());
		
		
		
	}
}
