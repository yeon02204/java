package overriding;

public class Computer extends Calculator {

	// 자바는 개발자의 실수를 줄여주기 위해 정확히 오버라이딩 됐는지 체크해준다
	// @override 어노테이션을 제공

	// @Override를 붙이게 되면 컴파일 단계에서 정확히 오버라이딩이 되었는지 체크하고
	// 문제가 있다면 컴파일 에러를 출력한다
	@Override
	public double areaCircle(double r) {
		System.out.println("자식 클래스의 메서드 실행");
		return Math.PI * r * r;
	}
}
