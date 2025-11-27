package overriding;

public class Main {
	public static void main(String[] args) {
		int r = 10;

		Computer c = new Computer();
		c.areaCircle(r);

		Calculator cal = new Calculator();
		cal.areaCircle(r);

		Person p = new Person();
		p.introduce();

		Student s = new Student();
		s.introduce();

		CalPlus cp = new CalPlus();
		System.out.println("CalPlus : " + cp.getResult(10, 20));

		CalMinus cm = new CalMinus();
		System.out.println("CalMinus : " + cm.getResult(20, 5));
	}
}
