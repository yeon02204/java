package ch14;

public class Car {

	// 필드 선언(맴버변수)
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	// 기본생성자 선언하기
	public Car() {
		
	}
	
	
	public Car(String model){
		this.model = model;
	}
	
	public Car(String model,String color){
		this(model);
		this.color = color;
	}
	
	public Car(String model,String color,int maxSpeed){
		this(model,color);
		this.maxSpeed = maxSpeed;
	}
	
	// this() : 같은 클래스 내의 다른 생성자를 호출
	
	
	
	
}
