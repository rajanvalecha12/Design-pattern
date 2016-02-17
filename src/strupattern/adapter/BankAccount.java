package strupattern.adapter;
//target
public class BankAccount {
private double principle;
public BankAccount(double principle){
	this.principle=principle;
}
public double calculate(){
	return principle*.10;
}
}
