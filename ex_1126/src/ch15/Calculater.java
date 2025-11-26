package ch15;

public class Calculater {
	
	// 리턴값이 없는 powerOn 메서드 만들기
	// 매개변수 없음
	// 기능 : "전원을 켭니다" 문자열 출력
	
	public void powerOn() {
		System.out.println("전원을 켭니다");
	}
	
	public void powerOff() {
		System.out.println("전원을 끕니다");
	}
	
	// 두 수를 더하는 plus 메서드 만들기
	// 반환형 int
	// 매개변수 : 정수형 두개
	// 기능 : 두 수를 더하여 반환
	
	public int plus(int x, int y) {
		return x + y;
	}
	
	public double divide(int x, int y) {
		return (double)x / y;
	}
	

}
