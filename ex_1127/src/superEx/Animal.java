package superEx;

public class Animal {
	
	String name;

//	생성자를 통해 필드의 이름을 초기화 시킨다.
//
//	메서드
//	info() : "이름 : xx"라고 출력하기
//

//
//	Main에서 객체 만들고 출력하기
	
	public Animal(String name) {
		this.name = name;
	}
	
	public void info() {
		System.out.println("이름 : " + name);
	}
	
	
	
	

}
