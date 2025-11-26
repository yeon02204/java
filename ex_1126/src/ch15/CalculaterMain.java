package ch15;

public class CalculaterMain {

	public static void main(String[] args) {
		
	// 클래스에 속해있는 함수는 독립적으로 실행할 수 없다
	// 객체를 생성하고 객체를 통해서 호출해야한다
	Calculater calc = new Calculater();
	
	calc.powerOn();

	calc.powerOff();
	
	int result1 = calc.plus(5, 6);
	System.out.println(result1);
	
	double result2 = calc.divide(6, 4);
	System.out.println(result2);
	
	
	}

}
