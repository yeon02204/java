package exam;

public class CardPayment implements Payment{

	@Override
	public void pay(int amount) {
		System.out.printf("CardPayment로 %d원 결제\n",amount);
		
	}

}
