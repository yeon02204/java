package package2;

import package1.A;

// A 클래스 상속하기
public class D extends A{
	
	// 기본 생성자
	
	public D() {
		super();// -> A생성자 호출 가능
	}
	
	public void method1() {
		// 상속받은 내용을 내껏처럼 쓸 수 있다는 걸 보여주기 위해서 this를 쓸 수 있다
		this.field = "value"; // 상속받은 field에 접근
		this.method();// 상속받은 method에 접근
	}
	
	public void method2() {
		// protected 접근 제한은 자식 클래스에서는 super()로 호출이 가능하나
		// 그냥 new A()로 객체를 만드는것은 다른 패키지에서는 허용되지 않는다
		// A a = new A(); -> 직접 객체 생성은 안됨
	}

}
