package exam;

// 2번문제
public class Calculator {
	int a;
	int b;

	public Calculator() {

	}

	public void Calculator(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public int add(int a, int b) {
		return a + b;
	}
	public int subtract(int a, int b) {
		return a - b;
	}
	public int multiply(int a, int b) {
		return a * b;
	}
	public double divide(int a, int b) {
		if(b == 0) {
			return 0;
		}
		return a / b;
	}
	
	

}
