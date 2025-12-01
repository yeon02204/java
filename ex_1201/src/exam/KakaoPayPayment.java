package exam;

public class KakaoPayPayment implements Payment{

	@Override
	public void pay(int amount) {
		System.out.printf("KakaoPayPayment로 %d원 결제\n",amount);
		
	}

}
