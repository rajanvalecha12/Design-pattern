package behaviouralpattern.observer;

import java.util.Observable;
import java.util.Observer;

public class Waiter implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		String msg=null;
		if(o instanceof MealOrder)
		{
			 msg=(String)arg;
			
		}
		if(msg.equals("Accepted"))
		{
			System.out.println("hurrah order accepted");
		}
		else if(msg.equals("completed"))
		{
			System.out.println("Congos order is ready");
		}
			
	}

}
