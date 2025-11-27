package singleton;

// 디자인패턴
// 코드 작성하는 방법론
public class Singleton {

	// private 접근 권한을 갖는 정적 필드 선언과 초기화
	// Singleton 객체를 생성(static 때문에 한번만 메모리에 올라감)
	private static Singleton singleton = new Singleton();
	
	// private 접근 권한을 갖는 생성자
	private Singleton() {
		
	}
	public static Singleton getInstance() {
		return singleton;
	}
	
}
