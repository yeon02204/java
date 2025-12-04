package exam;

public class Printer {

	String message;
	int value;
	double value2;

	public void Printer(String message, int value, double value2) {
		this.message = message;
		this.value = value;
		this.value2 = value2;
	}

	public void print(String message) {
		System.out.println("문자열 : " + message);
	}

	public void print(int value) {
		System.out.println("정수 : " + value);
	}

	public void print(double value2) {
		System.out.println("실수 : " + value2);
	}

}
