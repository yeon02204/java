package app;

// A, B 클래스는 module_a 에서 옴
// C, D 클래스는 module_b 에서 옴

import pack1.A;
import pack2.B;
import pack3.C;
import pack4.D;

public class Main {

	public static void main(String[] args) {
		A a = new A();
		a.method();
		
		B b = new B();
		b.method();
		
		C c = new C();
		c.method();
		
		D d = new D();
		d.method();

	}

}
