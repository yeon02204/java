package singleton;

public class Main {

	public static void main(String[] args) {

		Singleton s1 = Singleton.getInstance();

		Singleton s2 = Singleton.getInstance();

		System.out.println(s1);
		System.out.println(s2);

		// 여러군데에서 같이 써야하고, 여러개 존재하면 오히려 문제를 일으키는것을
		// 싱글톤 패턴으로 정의한다

		Counter c1 = Counter.getInstance();
		Counter c2 = Counter.getInstance();

		c1.increment();
		c2.increment();
		c2.increment();

		// c1, c2의 count값 조회하기
		System.out.println("c1의 값 : " + c1.getCount());
		System.out.println("c2의 값 : " + c2.getCount());
	}

}
