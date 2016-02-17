package strupattern.decorator;

public abstract class featureDecorator extends BankAccount {

	private BankAccount account;
	
	public featureDecorator(BankAccount account) {
		super();
		this.account = account;
	}



}
