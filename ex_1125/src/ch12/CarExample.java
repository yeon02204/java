package ch12;

public class CarExample {

	public static void main(String[] args) {
		// 자동차 객체 생성
		Car c1 = new Car();
		
		// 클래스 필드 출력
		c1.model= "소나타";
		c1.start= false;
		c1.speed= 60;
		c1.color= "balck";
		System.out.println(c1.model);
		System.out.println(c1.start);
		System.out.println(c1.speed);
		System.out.println(c1.color);
		
		
		// 자동차 객체 c2 만들기 
		Car c2 = new Car();
		
		// c2 출력
		c2.model= "캐스퍼";
		c2.start= true;
		c2.speed= 70;
		c2.color= "Green";
		System.out.println(c2.model);
		System.out.println(c2.start);
		System.out.println(c2.speed);
		System.out.println(c2.color);
		
		
	} // 메인

}// 클래스
