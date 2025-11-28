package ex_abstract;

public class Main {
	public static void main(String[] args) {

		Animal dog = new Dog();
		Animal cat = new Cat();

		dog.sound();
		cat.sound();

		// 추상화 언제 하냐?
		// 1. 공통된 추상 메서드가 있고 일부 동작만 다를때
		// 2. 반드시 구현해야하는 메서드를 강제 하고싶을때
		// 3. 큰 흐름은 부모에서 정하고, 세부 단계만 자식에게 맡길때

		Calculator calc = new GoodCalc();
		
		int[] x = { 1, 2, 3, 4, 5, 6 };
		
		System.out.println(calc.add(1, 2));
		System.out.println(calc.sub(6, 3));
		System.out.println(calc.avg(x));
	}
}
