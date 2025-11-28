package package2;

import package1.A;


public class C {
	
	// A클래스와 다른 패키지에 있기 때문에 protected로 선언된 
	// 필드, 생성자, 메소드에 접근할 수 없다

	public void method() {
//		A a = new A(); -> X
//		a.field = "sda"; -> X
//		a.method; -> X
	}
	
}
