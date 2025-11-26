package ch16;

public class CalculaterMain {

	public static void main(String[] args) {
		Calculater calc = new Calculater();

		double Rectangle = calc.areaRectangle(4);

		System.out.println("정사각형 넓이:" + Rectangle);

		Rectangle = calc.areaRectangle(5, 10);
		System.out.println("직사각형 넓이:" + Rectangle);

		System.out.println(Calculater.pi);
		System.out.println(calc.pi);

		Calculater.plus(6, 5);
	}

}
