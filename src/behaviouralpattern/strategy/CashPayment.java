package behaviouralpattern.strategy;

public class CashPayment implements PaymentStrategy {

	@Override
	public String pay(double amt, String description) {
		// TODO Auto-generated method stub
		String msg = "Keep ur shit amount." + amt + " By cash " + description + " Received\n";
		StringBuffer buffer = new StringBuffer(msg);
		
		double discount = amt * 0.1;
		
		double total = amt - discount;
		buffer.append("Discount of Rs." + discount + "Is Applied\n");
		buffer.append("Net Amount Rs." + total);
		return buffer.toString();
	}

}
