package strupattern.decorator;

public class OnlineBanking extends featureDecorator {
BankAccount account;

	public OnlineBanking(BankAccount account) {
	super(account);
	this.account = account;
}

	@Override
	public double balanceToMaintain() {
		// TODO Auto-generated method stub
		return account.balanceToMaintain()+5000.00;
	}

}
