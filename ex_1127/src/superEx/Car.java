package superEx;

public class Car {

//	Car클래스
//	필드
	int gasolineGague ;
//	생성자를 통해 필드를 초기화 한다.

	public Car(int gasolineGague) {
		this.gasolineGague = gasolineGague;
	}

//	메서드
//	showCurrentGague() : 잔여 가솔린량을 출력

	public void showCurrentGague() {
		System.out.println("잔여 가솔린량 :" + gasolineGague);
	}
}
//	Car클래스를 상속
//	필드
//	int eletricGague;
//
//	생성자를 통해 필드를 초기화 한다.
//
//	메서드는 오버라이딩 하여 잔여 가솔린량과 잔여 전기량을 출력
	class HybridCar extends Car {

		int eletricGague;

		public HybridCar(int gasolineGague, int eletricGague) {
			super(gasolineGague);
			this.eletricGague = eletricGague;
		}

		@Override
		public void showCurrentGague() {
			super.showCurrentGague(); 
			System.out.println("잔여 전기량" + eletricGague);
		}

	}


	
//	HybridWaterCar클래스
//	HybridCar클래스를 상속
//	필드
//	int waterGague;
//
//	생성자를 통해 필드를 초기화 한다.
//
//	메서드는 오버라이딩 하여 잔여 가솔린,전기,물의양을 출력한다.

	class HybridWaterCar extends HybridCar {

		int waterGague;

		public HybridWaterCar(int gasolineGague, int eletricGague, int waterGague) {
			super(gasolineGague, eletricGague);
			this.waterGague = waterGague;

		}

		@Override
		public void showCurrentGague() {
			super.showCurrentGague();  
			System.out.println("물의 양" + waterGague);
		}

	}

//	Main에서 HybridWater객체를 생성하여 다음과 같은 결과 출력하기
//	잔여 가스량 : 15
//	잔여 전기량 :30
//	잔여 물의양 : 25


