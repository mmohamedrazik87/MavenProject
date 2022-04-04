package learnInterface;

public class Sbi implements Rbi {

	@Override
	public void openAccout() {
		// TODO Auto-generated method stub
		System.out.println("Account Opened");
	}

	@Override
	public void provideDebitCard() {
		// TODO Auto-generated method stub
		System.out.println("Debit Card Provided");

	}

	public void provideCreditCard() {
		System.out.println("Credit Card Provided");
	}
}