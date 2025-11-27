package getter_setter;

public class Main {

	public static void main(String[] args) {
		Car c = new Car();

		// 자동차 객체의 c.speed 필드에 접근 할 수 있다

		// 속도는 음수가 될 수 없다
		// - 150.0도 실수이기 때문에 문법적인 에로눈 없다
		// c.speed = -1500.;

		c.setSpeed(150.0); // 속도를 세팅
		double speed = c.getSpeed(); // 세팅된 필드의 값을 얻어올 수 있다
		System.out.println("차량의 속도 : " + speed);

		Score sc = new Score();

		sc.setScore(85, 92, 75);

		System.out.println("총점 : " + sc.getTotal());

		System.out.println("평균 : " + sc.getAverage());

	}
}
