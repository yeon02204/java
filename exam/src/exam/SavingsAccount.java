package exam;

public class SavingsAccount extends BankAccount{

	public SavingsAccount(String owner, int balance) {
		super(owner, balance);
	}
	
	@Override
	public void withdraw(int amount) {
		if (amount < (balance / 2)) {
			balance -= amount;
			System.out.println("남은 잔금 : "+ balance);
		}else if( amount > (balance / 2)) {
			System.out.println("적금 계좌는 한번에 잔액의 50%만 출금 가능합니다");
		}
	}

}
