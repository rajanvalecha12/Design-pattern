package strupattern.adapter;

import org.omg.PortableServer.AdapterActivator;

public class Client {

	public static void main(String[] args) {
		BankAccountAdapter adapter=new BankAccountAdapter(50000,new LifeInsurance(600000));
		double totalDue=adapter.findTotalDue();
		System.out.println("total due:="+ totalDue);

	}

}
