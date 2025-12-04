package exam2;

public class Main {

	public static void main(String[] args) {
		Person p = new Person("홍길동", 20);
		p.introduce();
		Person p2 = new Student("홍길동", 20, "컴퓨터공학과");
		p2.introduce();

	}

}
