package ch13;

import java.util.Random;
import java.util.Scanner;

public class CarMain {

	public static void main(String[] args) {

		// 기본생성자의 정의없이, 매개변수가 있는 생성자를 정의하면
		// 더이상 기본 생성자를 사용할 수 없다
		//Car c1 = new Car();
		
		
		Car myCar = new Car("캐스퍼", "카키", 160);
		System.out.println(myCar.model);
		System.out.println(myCar.color);
		System.out.println(myCar.maxSpeed);
		
		
		String s = new String("홍길동");
        
	    Random r = new Random();
	      
	    Scanner sc = new Scanner(System.in);
	}
}
