package strupattern.decorator;

public class SocialNetWorking extends featureDecorator {
BankAccount account;

	public SocialNetWorking(BankAccount account) {
	super(account);
	this.account = account;
}

	@Override
	public double balanceToMaintain() {
		// TODO Auto-generated method stub
		return account.balanceToMaintain()+10000.00;
	}

}
