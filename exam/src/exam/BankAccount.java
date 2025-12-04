package exam;

public class BankAccount {

	String owner;
	int balance;

	public BankAccount(String owner, int balance) {
		this.owner = owner;
		this.balance = balance;
	}

	

	public void deposit(int amount) {
		balance += amount;
	}
	
	public void withdraw(int amount) {
		if(balance > 0) {
			balance -= amount;
		} else if (balance < 0 ) {
			System.out.println("잔액 부족");
		}
	}
}
