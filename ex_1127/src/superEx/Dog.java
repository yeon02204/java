package superEx;

public class Dog extends Animal {

//	자식클래스 : Dog 클래스
//	필드
//	int age
//
//	생성자를 통해 필드의 값을 초기화 한다.

	int age;

	public Dog(String name, int age) {
		super(name);
		this.age = age;
	}

	@Override
	public void info() {
		System.out.println("이름 : " + name + ", 나이 : " + age);
	}

}
