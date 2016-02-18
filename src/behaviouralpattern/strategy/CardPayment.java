package behaviouralpattern.strategy;

public class CardPayment implements PaymentStrategy {

	@Override
	public String pay(double amt, String description) {
String msg ="your payment of inr."+amt+"by card"+description+"Received";
StringBuffer buffer=new StringBuffer(msg);
double proceFee=amt*0.012;
double total=proceFee+amt;
buffer.append("processing fee of rs"+proceFee+"is chargeable");
buffer.append("net amoumt rs."+total);
return buffer.toString();

	}

}
