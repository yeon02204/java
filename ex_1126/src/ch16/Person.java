package ch16;

public class Person {

	static String NAME;
	static int AGE;
	
	static { 
		// static과 관련된 것들을 초기화 해줄 수 있다.
		// 클래스가 처음 메모리에 올라갈때 딱 한번 실행되는 초기값
		NAME = "홍길동";
		AGE = 20;
	}
}
