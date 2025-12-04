package exam;

public class Main {

	public static void main(String[] args) {

		// 1번문제
		Student st = new Student();
		st.printInfo("홍길동", 20, "컴퓨터공학과");

		// 2번문제
		Calculator calc = new Calculator();
		System.out.println(calc.add(5, 6));
		System.out.println(calc.subtract(7, 3));
		System.out.println(calc.multiply(5, 6));
		System.out.println(calc.divide(30, 5)); // b가 0이면 결과 : 0.0

		// 3번문제
		Point p1 = new Point();
		Point p2 = new Point(2, 4);

		p1.printPoint();
		p2.printPoint();

		// 4번문제
		Printer p = new Printer();
		p.print("문자열");
		p.print(10);
		p.print(3.14);

		// 5번문제
		// 패키지 exam2 로 이동

		// 6번문제
		Animal[] animals = new Animal[3];

		animals[0] = new Animal();
		animals[1] = new Dog();
		animals[2] = new Cat();

		for (int i = 0; i < animals.length; i++) {
			animals[i].sound();
		}

		// 7번문제
		Shape s1 = new Rectangle(4.0, 5.0);
		Shape s2 = new Circle(5.0);

		System.out.println(s1.area());
		System.out.println(s2.area());

		// 8번문제
		Movable m = new Car();
		m.move(10,20);
		
		// 9번 문제
		Printable[] printables = new Printable[2];
		
		printables[0] = new ConsolePrinter();
		printables[1] = new FilePrinter();
		
		for(int i = 0; i < printables.length; i++) {
			printables[i].print("hello");
		}
		
		// 10번문제
		BankAccount ba = new SavingsAccount("길동", 100000);
		ba.withdraw(30000);
		ba.withdraw(80000);
	}

}
